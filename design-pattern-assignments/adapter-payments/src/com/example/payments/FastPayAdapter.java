package com.example.payments;

import java.util.Objects;

public class FastPayAdapter implements PaymentGateway {
    private final FastPayClient fastpayClient;

    public FastPayAdapter(FastPayClient fastpayClient) {
        this.fastpayClient = Objects.requireNonNull(fastpayClient, "fastpayClient");
    }

    @Override
    public String charge(String customerId, int amountCents) {
        Objects.requireNonNull(customerId, "customerId");
        return fastpayClient.payNow(customerId, amountCents);
    }
    
}
