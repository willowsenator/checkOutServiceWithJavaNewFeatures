package org.willownsenator.service;

import org.willownsenator.domain.CheckOutStatus;
import org.willownsenator.domain.OrderDetails;
import org.willownsenator.domain.PaymentResponse;
import org.willownsenator.payment.PaymentService;

public class CheckoutService {
    private final PaymentService paymentService;

    public CheckoutService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public CheckOutStatus checkoutOrder(OrderDetails orderDetails){
        var paymentResponse = paymentService.makePayment(orderDetails);
        if(paymentResponse.equals(PaymentResponse.SUCCESS)){
            return CheckOutStatus.SUCCESS;
        } else{
            return CheckOutStatus.FAILURE;
        }
    }
}
