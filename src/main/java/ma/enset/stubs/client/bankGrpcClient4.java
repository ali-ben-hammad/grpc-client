package ma.enset.stubs.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.enset.stubs.Bank;
import ma.enset.stubs.bankServiceGrpc;

import java.io.IOException;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class bankGrpcClient4 {
    public static void main(String[] args) throws IOException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5555)
                .usePlaintext()
                .build();

        bankServiceGrpc.bankServiceStub asyncStub = bankServiceGrpc.newStub(channel);

        Bank.convertCurrencyRequest request = Bank.convertCurrencyRequest.newBuilder()
                .setFrom("USD")
                .setTo("MAD")
                .setAmount(100)
                .build();

        StreamObserver<Bank.convertCurrencyRequest> performStream = asyncStub.performSteam(new StreamObserver<Bank.convertCurrencyResponse>() {
            @Override
            public void onNext(Bank.convertCurrencyResponse convertCurrencyResponse) {
                System.out.println("************");
                System.out.println(convertCurrencyResponse);
                System.out.println("************");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
                System.out.println("************");
            }

            @Override
            public void onCompleted() {
                System.out.println("************");
                System.out.println("End");
                System.out.println("************");
            }
        });

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int count = 0;
            @Override
            public void run() {
                Bank.convertCurrencyRequest request = Bank.convertCurrencyRequest.newBuilder()
                        .setFrom("USD")
                        .setTo("MAD")
                        .setAmount(Math.random()*7101)
                        .build();
                performStream.onNext(request);
                count++;
                System.out.println("************> "+count+" <************");
                if(count == 10) {
                    performStream.onCompleted();
                    timer.cancel();
                }
            }
        }, 1000, 1000);
        performStream.onNext(request);


        System.out.println(".........?");
        System.in.read();

    }

}
