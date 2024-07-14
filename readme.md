#  progressive payment gateway structure
#### a payment structure gateway allowing for progressive development,  making it easy to add new payment gateways in the future without needing to change the code structure.

## what's the code is missing ?

- the  ```pay(Card card)```  logic  because every payment gateway has its own logic
- the  ```checkCardValidation(Card card)``` logic to check if the card is valid

## To add new payment gateway

Inside ```paymentProccessors``` directory add new class, for example ```Paypal``` that implements ```paymentProcessor```,
you will need to Override two methods ``` pay(Card card)``` and ```checkCardValidation(Card card)```, both of them accepts
``Card``` as an arguments.

## Building  a new card 

Card is using Builder pattern so you have to Build it like this for example :
```java 
Card card = new Card.CardBuilder()
                .setCardNumber("5350239959461533")
                .setSecurityNumber(369)
                .setExpiryDate("01/29")
                .setAddress("some street address")
                .setCardIssuer(CardIssuer.MASTERCARD)
                .setName("mr Mohamed khounti")
                .build();
```
then you need to pass the card to the ``` pay(Card card) ```  method and ```checkCardValidation(Card card)``` like this :

```java
//create an instance of stripe
Stripe stripe = new Stripe();

// chick if card is valid
boolean isValid = stripe.checkCardValidation(card);

// pay using the card provided
String result = stripe.pay(card);

```


