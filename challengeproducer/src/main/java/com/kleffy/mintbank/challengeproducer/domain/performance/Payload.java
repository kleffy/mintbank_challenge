package com.kleffy.mintbank.challengeproducer.domain.performance;

import java.util.Map;

public class Payload {
    private Map<String, Integer> cardHits;

    private Payload(Builder builder){
        this.cardHits = builder.cardHits;
    }

    public Map<String, Integer> getCardHits() {
        return cardHits;
    }

    @Override
    public String toString() {
        return "Payload{" +
                "cardHits=" + cardHits +
                '}';
    }

    public static class Builder {
        private Map<String, Integer> cardHits;

        public Builder cardHits(Map<String, Integer> cardHits){
            this.cardHits = cardHits;
            return this;
        }

        public Builder copy(Payload payload){
            this.cardHits = payload.cardHits;
            return this;
        }

        public Payload build(){
            return new Payload(this);
        }
    }
}
