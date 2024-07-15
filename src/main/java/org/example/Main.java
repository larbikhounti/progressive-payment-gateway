package org.example;

import java.awt.*;
import java.util.Map;

import com.stripe.Stripe;
import com.stripe.StripeClient;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.PaymentIntent;
import com.stripe.model.PaymentMethod;
import com.stripe.param.CustomerCreateParams;
import com.stripe.param.PaymentIntentCreateParams;
import com.stripe.param.PaymentMethodCreateParams;
import org.example.config.ConfigUtil;
import org.example.payment.enums.CardIssuer;
import org.example.payment.models.Card;
import org.example.payment.paymentProcessors.StripeGateway;

public class Main {
    public static void main(String[] args) {

        // // create a card
         Card card = new Card.CardBuilder()
                 .setCardNumber("5350239959461533")
                 .setSecurityNumber(369)
                 .setExpiryDate("01/29")
                 .setAddress("some street address")
                 .setCardIssuer(CardIssuer.MASTERCARD)
                 .setName("mr Mohamed khounti")
                 .setAmount(500L)
                 .build();

        // // create an instance of stripe
        StripeGateway stripe = new StripeGateway();

         // pay using the card provided
         String result = stripe.pay(card);

         //print out the results
         System.out.print(result);




    }
}