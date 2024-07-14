package org.example.payment.paymentProcessors;

import org.example.payment.interfaces.paymentProcessor;
import org.example.payment.models.Card;

import java.util.Date;

public class Stripe implements paymentProcessor {

    /**
     * pay method
     * @param card card
     * @return TransactionId | error
     **/
    @Override
    public String pay(Card card) {
        //TODO : ADD PAYMENT LOGIC AND RETURN THE REAL RESULTS
       return  card.toString();
    }

    /**
     * check if card is valid
     * @param card cart
     * @return true | false
     */
    @Override
    public Boolean checkCardValidation(Card card) {
        //TODO : ADD CHECKING LOGIC AND RETURN THE REAL RESULTS
        return true;
    }
}
