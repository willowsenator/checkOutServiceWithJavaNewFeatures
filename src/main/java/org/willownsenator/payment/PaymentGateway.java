package org.willownsenator.payment;

import org.willownsenator.domain.Card;
import org.willownsenator.domain.PaymentResponse;

public sealed interface PaymentGateway
        permits CreditCardPayment,
                DebitCardPayment,
                RewardsCardPayment {
    PaymentResponse makePayment(Card card, double amount);
}
