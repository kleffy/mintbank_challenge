package com.kleffy.mintbank.challengeproducer.domain.performance;

public class VerifiedCard {
    private String cardNumber, scheme, type, bank;

    public VerifiedCard(Builder builder) {
        this.cardNumber = builder.cardNumber;
        this.scheme = builder.scheme;
        this.type = builder.type;
        this.bank = builder.bank;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getScheme() {
        return scheme;
    }

    public String getType() {
        return type;
    }

    public String getBank() {
        return bank;
    }

    @Override
    public String toString() {
        return "VerifiedCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", scheme='" + scheme + '\'' +
                ", type='" + type + '\'' +
                ", bank='" + bank + '\'' +
                '}';
    }

    public static class Builder {
        private String cardNumber, scheme, type, bank;

        public Builder cardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder scheme(String scheme) {
            this.scheme = scheme;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder bank(String bank) {
            this.bank = bank;
            return this;
        }

        public Builder copy(VerifiedCard vc) {
            this.cardNumber = vc.cardNumber;
            this.scheme = vc.scheme;
            this.type = vc.type;
            this.bank = vc.bank;
            return this;
        }

        public VerifiedCard build(){
            return new VerifiedCard(this);
        }
    }
}
