package ma.enset.stubs.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ma.enset.stubs.Bank;
import ma.enset.stubs.bankServiceGrpc;

public class bankGrpcClient1
{
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5555)
                .usePlaintext()
                .build();

        bankServiceGrpc.bankServiceBlockingStub stub = bankServiceGrpc.newBlockingStub(channel);

        Bank.convertCurrencyRequest request = Bank.convertCurrencyRequest.newBuilder()
                .setFrom("USD")
                .setTo("MAD")
                .setAmount(100)
                .build();
// this calls the convert method of the service, by a blocking stub
// this is why we used the newBlockingStub and only sent one parameter to the convert method
// no StreamObserver parameter is needed
        Bank.convertCurrencyResponse response = stub.convert(request);

        System.out.println(response);

        channel.shutdown();
    }
}
