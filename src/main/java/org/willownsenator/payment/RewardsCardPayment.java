package org.willownsenator.payment;

import org.willownsenator.domain.Card;
import org.willownsenator.domain.PaymentResponse;

public final class RewardsCardPayment implements PaymentGateway {
    @Override
    public PaymentResponse makePayment(Card card, double amount) {
        System.out.println("Rewards Card Payment for the amount " + amount);
        return PaymentResponse.SUCCESS;
    }
}
