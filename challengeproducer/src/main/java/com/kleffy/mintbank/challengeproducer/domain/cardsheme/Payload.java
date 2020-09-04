package com.kleffy.mintbank.challengeproducer.domain.cardsheme;

public class Payload {
    private String scheme, type, bank;

    private Payload(Builder builder) {
        this.scheme = builder.scheme;
        this.type = builder.type;
        this.bank = builder.bank;
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
        return "CardPayload{" +
                "scheme='" + scheme + '\'' +
                ", type='" + type + '\'' +
                ", bank='" + bank + '\'' +
                '}';
    }

    public static class Builder {

        private String scheme, type, bank;

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

        public Builder copy(Payload payload) {
            this.scheme = payload.scheme;
            this.type = payload.type;
            this.bank = payload.bank;
            return this;
        }

        public Payload build() {
            return new Payload(this);
        }
    }
}
