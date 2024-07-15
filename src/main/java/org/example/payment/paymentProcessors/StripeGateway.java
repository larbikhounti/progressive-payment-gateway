package org.example.payment.paymentProcessors;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import org.example.config.ConfigUtil;
import org.example.payment.interfaces.paymentProcessor;
import org.example.payment.models.Card;

public class StripeGateway implements paymentProcessor {



    public StripeGateway() {
        Stripe.apiKey = ConfigUtil.getProperty("STRIPE.SECRET");
    }

    /**
     * pay method
     * @param card card
     * @return TransactionId | error
     **/
    @Override
    public String pay(Card card) {
        PaymentIntentCreateParams params =
                PaymentIntentCreateParams.builder()
                        .setAmount(card.getAmount())
                        .setCurrency("gbp")
                        .setPaymentMethod("pm_card_visa")
                        .setConfirm(true)
                        .setReturnUrl("https://localhost")
                        .build();

        try {
            PaymentIntent paymentIntent = PaymentIntent.create(params);
            // will return payment status
            return  paymentIntent.getStatus();
        } catch (StripeException e) {
            throw new RuntimeException(e);
        }


    }

    /**
     * check if card is valid
     * @param card cart
     * @return true | false
     */
    @Override
    public Boolean checkCardValidation(Card card) {
        //TODO : ADD CHECKING LOGIC AND RETURN THE REAL RESULTS
        //in this case Stripe automatically checks Card validation
        return true;
    }
}
