package com.kleffy.mintbank.challengeproducer.domain.verifycard;

import java.io.Serializable;

public class VerifyCardResponse implements Serializable {
    private boolean success;
    private Payload payload;

    private VerifyCardResponse(Builder builder) {
        this.payload = builder.payload;
        this.success = builder.success;
    }

    public boolean isSuccess() {
        return success;
    }

    public Payload getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return "VerifyCardResponse{" +
                "success=" + success +
                ", cardPayload=" + payload +
                '}';
    }

    public static class Builder {

        private boolean success;
        private Payload payload;

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder cardPayload(Payload payload) {
            this.payload = payload;
            return this;
        }

        public Builder copy(VerifyCardResponse vcr) {
            this.payload = vcr.payload;
            this.success = vcr.success;
            return this;
        }

        public VerifyCardResponse build() {
            return new VerifyCardResponse(this);
        }

    }
}
