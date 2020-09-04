package com.kleffy.mintbank.challengeproducer.domain.performance;


public class CardHit {
    private String cardNumber;
    private int hitTimes;

    private CardHit(Builder builder) {
        this.cardNumber = builder.cardNumber;
        this.hitTimes = builder.hitTimes;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getHitTimes() {
        return hitTimes;
    }

    @Override
    public String toString() {
        return "CardHit{" +
                "cardNumber='" + cardNumber + '\'' +
                ", hitTimes=" + hitTimes +
                '}';
    }

    public static class Builder {
        private String cardNumber;
        private int hitTimes;

        public Builder cardNumber(String cardNumber){
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder hitTimes(int hitTimes){
            this.hitTimes = hitTimes;
            return this;
        }

        public Builder copy(CardHit ch){
            this.cardNumber = ch.cardNumber;
            this.hitTimes = ch.hitTimes;
            return this;
        }

        public CardHit build (){
            return new CardHit(this);
        }
    }
}
