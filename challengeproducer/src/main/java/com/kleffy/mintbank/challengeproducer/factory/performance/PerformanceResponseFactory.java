package com.kleffy.mintbank.challengeproducer.factory.performance;

import com.kleffy.mintbank.challengeproducer.domain.performance.Payload;
import com.kleffy.mintbank.challengeproducer.domain.performance.PerformanceResponse;

import java.util.Map;

public class PerformanceResponseFactory {

    public static PerformanceResponse buildPerformanceResponse(boolean success, int start, int limit, int size, Payload payload){
        return new PerformanceResponse.Builder()
                .success(success)
                .start(start)
                .limit(limit)
                .size(size)
                .payload(payload)
                .build();
    }
}
