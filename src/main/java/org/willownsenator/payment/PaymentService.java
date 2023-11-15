package org.willownsenator.payment;

import org.willownsenator.domain.OrderDetails;
import org.willownsenator.domain.PaymentResponse;

public class PaymentService {
    public PaymentResponse makePayment(OrderDetails orderDetails){
        var paymentGateway = PaymentFactory.paymentGateway(orderDetails.card().cardType());
        return paymentGateway.makePayment(orderDetails.card(), orderDetails.finalAmount());
    }
}
