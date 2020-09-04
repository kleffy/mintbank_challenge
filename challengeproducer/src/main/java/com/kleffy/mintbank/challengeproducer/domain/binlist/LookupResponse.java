package com.kleffy.mintbank.challengeproducer.domain.binlist;

public class LookupResponse {
    private String scheme, type;
    private Bank bank;

    public LookupResponse(Builder builder){
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

    public Bank getBank() {
        return bank;
    }

    @Override
    public String toString() {
        return "LookupResponse{" +
                "scheme='" + scheme + '\'' +
                ", type='" + type + '\'' +
                ", bank=" + bank +
                '}';
    }

    public static class Builder{
        private String scheme, type;
        private Bank bank;

        public Builder scheme(String scheme){
            this.scheme = scheme;
            return this;
        }

        public Builder type(String type){
            this.type = type;
            return this;
        }

        public Builder bank(Bank bank){
            this.bank=bank;
            return this;
        }

        public Builder copy(LookupResponse lr){
            this.scheme = lr.scheme;
            this.type = lr.type;
            this.bank = lr.bank;
            return this;
        }

        public LookupResponse build(){
            return new LookupResponse(this);
        }
    }
}
