package com.kleffy.mintbank.challengeproducer.domain.binlist;

public class Bank {
    private String name;

    public Bank(Builder builder){
        this.name = builder.name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                '}';
    }

    public static class Builder{
        private String name;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder copy(Bank bank){
            this.name = bank.name;
            return this;
        }

        public Bank build(){
            return new Bank(this);
        }
    }
}
