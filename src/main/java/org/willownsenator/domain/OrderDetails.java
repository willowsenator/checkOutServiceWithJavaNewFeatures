package org.willownsenator.domain;

public record OrderDetails(String orderId, Card card, double finalAmount) {
}
