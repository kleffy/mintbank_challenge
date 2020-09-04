package com.kleffy.mintbank.challengeproducer.domain.performance;

import java.util.Map;

public class PerformanceResponse {
    private boolean success;
    private int start, limit, size;
    private Map<String, Integer> payload;

    public boolean isSuccess() {
        return success;
    }

    public int getStart(){
        return start;
    }

    public int getLimit() {
        return limit;
    }

    public int getSize(){
        return size;
    }

    public Map<String, Integer> getPayload(){
        return payload;
    }

    public PerformanceResponse(Builder builder){
        this.success = builder.success;
        this.start = builder.start;
        this.limit = builder.limit;
        this.size = builder.size;
        this.payload = builder.payload;
    }

    @Override
    public String toString() {
        return "PerformanceResponse{" +
                "success=" + success +
                ", start=" + start +
                ", limit=" + limit +
                ", size=" + size +
                ", payload=" + payload +
                '}';
    }

    public static class Builder{

        private boolean success;
        private int start, limit, size;
        private Map<String, Integer> payload;

        public Builder success(boolean success){
            this.success = success;
            return this;
        }

        public Builder start(int start){
            this.start = start;
            return this;
        }

        public Builder limit(int limit){
            this.limit = limit;
            return this;
        }

        public Builder payload(Map<String, Integer> payload){
            this.payload = payload;
            return this;
        }

        public Builder copy(PerformanceResponse pr){
            this.success = pr.success;
            this.start = pr.start;
            this.limit = pr.limit;
            this.size = pr.size;
            return this;
        }

        public PerformanceResponse build(){
            return new PerformanceResponse(this);
        }
    }
}
