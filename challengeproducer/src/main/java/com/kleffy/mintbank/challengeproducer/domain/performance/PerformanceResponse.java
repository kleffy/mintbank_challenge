package com.kleffy.mintbank.challengeproducer.domain.performance;

import java.util.Map;

public class PerformanceResponse {
    private boolean success;
    private int start, limit, size;
    private Map<String, Integer> payload;

    public PerformanceResponse(boolean success, int start, int limit, int size, Payload payload) {
        this.success = success;
        this.start = start;
        this.limit = limit;
        this.size = size;
        this.payload = payload.getCardHits();
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Map<String, Integer> getPayload() {
        return payload;
    }

    public void setPayload(Map<String, Integer> payload) {
        this.payload = payload;
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
}
