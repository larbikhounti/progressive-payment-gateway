package org.example.payment.models;

import org.example.payment.enums.CardIssuer;

public class Card {
    private final String cardNumber;
    private final String expiryDate;
    private final int securityNumber;
    private final String address;
    private final String name;


    public Card(CardBuilder cardBuilder) {
        this.cardNumber = cardBuilder.getCardNumber();
        this.expiryDate = cardBuilder.getExpiryDate();
        this.securityNumber = cardBuilder.getSecurityNumber();
        this.address = cardBuilder.getAddress();
        this.name = cardBuilder.getName();
        CardIssuer cardIssuer = cardBuilder.getCardIssuer();
    }

    public static class CardBuilder {
        private String cardNumber;
        private String expiryDate;
        private int securityNumber;
        private String address;
        private CardIssuer cardIssuer;
        private  String name;

        public String getName() {
            return name;
        }

        public CardBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CardIssuer getCardIssuer() {
            return cardIssuer;
        }

        public CardBuilder setCardIssuer(CardIssuer cardIssuer) {
            this.cardIssuer = cardIssuer;
            return this;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public int getSecurityNumber() {
            return securityNumber;
        }

        public String getAddress() {
            return address;
        }

        public CardBuilder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public CardBuilder setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public CardBuilder setSecurityNumber(int securityNumber) {
            this.securityNumber = securityNumber;
            return this;
        }

        public CardBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Card build(){
            return new Card(this);
        }

        @Override
        public String toString() {
            return "CardBuilder{" +
                    "cardNumber='" + cardNumber + '\'' +
                    ", expiryDate=" + expiryDate +
                    ", securityNumber=" + securityNumber +
                    ", address='" + address + '\'' +
                    '}';
        }
    }



    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", expiryDate=" + expiryDate +
                ", securityNumber=" + securityNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
