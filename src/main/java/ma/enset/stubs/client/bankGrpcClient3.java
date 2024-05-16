package ma.enset.stubs.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.enset.stubs.Bank;
import ma.enset.stubs.bankServiceGrpc;

import java.io.IOException;

public class bankGrpcClient3 {
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



        // the StreamObserver parameter is used to handle the stream of responses
       asyncStub.getCurrencyStream(request, new StreamObserver<Bank.convertCurrencyResponse>() {
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

        System.out.println(".........?");
        System.in.read();

    }

}
