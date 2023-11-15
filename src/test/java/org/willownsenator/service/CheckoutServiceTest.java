package org.willownsenator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.willownsenator.domain.Card;
import org.willownsenator.domain.CardType;
import org.willownsenator.domain.CheckOutStatus;
import org.willownsenator.domain.OrderDetails;
import org.willownsenator.payment.PaymentService;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutServiceTest {
    PaymentService paymentService = new PaymentService();
    CheckoutService checkoutService = new CheckoutService(paymentService);

    @EnumSource(CardType.class)
    @ParameterizedTest(name = "Checkout for Card type: {0}")
    void checkout(CardType cardType){
        var orderDetails = orderDetails(cardType);

        var response = checkoutService.checkoutOrder(orderDetails);

        assertEquals(CheckOutStatus.SUCCESS, response);
    }



    static OrderDetails orderDetails (CardType cardType){
        var card = new Card("ABC", "12354453432423", "345", "09/29", cardType);
        return new OrderDetails("1234", card, 110.0);
    }
}