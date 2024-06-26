package ma.enset.stubs.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.enset.stubs.Bank;
import ma.enset.stubs.bankServiceGrpc;

import java.io.IOException;

public class bankGrpcClient2 {
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

// this differs from the first client by using an asynchronous stub to call the convert method
 // this is why we added the optionalal StreamObserver parameter to the convert method
        asyncStub.convert(request, new StreamObserver<Bank.convertCurrencyResponse>() {
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
                System.out.println("completed");
                System.out.println("************");
            }

        });

        System.out.println(".........?");
        System.in.read();

    }

}
