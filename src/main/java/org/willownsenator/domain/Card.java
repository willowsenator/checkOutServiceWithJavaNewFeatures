package org.willownsenator.domain;

public record Card(String name, String cardNumber, String verificationCode, String expiryDate, CardType cardType) {
}
