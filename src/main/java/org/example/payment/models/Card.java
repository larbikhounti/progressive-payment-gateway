package org.example.payment.models;

import org.example.payment.enums.CardIssuer;

public class Card {
    public final String cardNumber;
    public final String expiryDate;
    public final Integer securityNumber;
    private final String address;
    private final String name;
    private final Long amount;
    private  final CardIssuer cardIssuer;

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public Integer getSecurityNumber() {
        return securityNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public Long getAmount() {
        return amount;
    }

    public CardIssuer getCardIssuer() {
        return cardIssuer;
    }

    public Card(CardBuilder cardBuilder) {
        this.cardNumber = cardBuilder.cardNumber;
        this.expiryDate = cardBuilder.expiryDate;
        this.securityNumber = cardBuilder.securityNumber;
        this.address = cardBuilder.address;
        this.name = cardBuilder.name;
        this.amount = cardBuilder.amount;
        this.cardIssuer = cardBuilder.cardIssuer;
    }

    public static class CardBuilder {
        private String cardNumber;
        private String expiryDate;
        private Integer securityNumber;
        private String address;
        private CardIssuer cardIssuer;
        private String name;
        private  Long amount;



        public CardBuilder setAmount(Long amount) {
            this.amount = amount;
            return this;
        }


        public CardBuilder setName(String name) {
            this.name = name;
            return this;
        }



        public CardBuilder setCardIssuer(CardIssuer cardIssuer) {
            this.cardIssuer = cardIssuer;
            return this;
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
                    ", expiryDate='" + expiryDate + '\'' +
                    ", securityNumber=" + securityNumber +
                    ", address='" + address + '\'' +
                    ", cardIssuer=" + cardIssuer +
                    ", name='" + name + '\'' +
                    ", amount=" + amount +
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
