package org.example;

import org.example.payment.enums.CardIssuer;
import org.example.payment.models.Card;
import org.example.payment.paymentProcessors.Stripe;

public class Main {
    public static void main(String[] args) {

        // create a card
        Card card = new Card.CardBuilder()
                .setCardNumber("5350239959461533")
                .setSecurityNumber(369)
                .setExpiryDate("01/29")
                .setAddress("some street address")
                .setCardIssuer(CardIssuer.MASTERCARD)
                .setName("mr Mohamed khounti")
                .build();
        // create an instance of stripe
        Stripe stripe = new Stripe();

        // chick if card is valid
        //TODO : IF THE CARD IS NOT VALID NOTIFY THE USER
        boolean isValid = stripe.checkCardValidation(card);

        // pay using the card provided
        String result = stripe.pay(card);

        //print out the results
        System.out.print(result);

    }
}