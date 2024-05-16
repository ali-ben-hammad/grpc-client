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

        Bank.convertCurrencyResponse response = stub.convert(request);

        System.out.println(response);

        channel.shutdown();
    }
}
