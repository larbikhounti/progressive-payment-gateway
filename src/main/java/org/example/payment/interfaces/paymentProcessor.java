package org.example.payment.interfaces;

import org.example.payment.models.Card;

public interface paymentProcessor {
    /**
     * pay method
     * @return TransactionId | error
     **/
    String pay (Card card);
    // check if card is valid
    /**
     * check if card is valid
     * @return  true | false
     **/
    Boolean checkCardValidation (Card card);



}
