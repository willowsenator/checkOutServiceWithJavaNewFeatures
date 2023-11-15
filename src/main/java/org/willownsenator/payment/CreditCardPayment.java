package org.willownsenator.payment;

import org.willownsenator.domain.Card;
import org.willownsenator.domain.PaymentResponse;

public final class CreditCardPayment implements PaymentGateway {
    @Override
    public PaymentResponse makePayment(Card card, double amount) {
        System.out.println("Credit Card Payment for the amount " + amount);
        return PaymentResponse.SUCCESS;
    }
}
