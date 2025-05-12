package com.vladproduction.app22.exception_handling.advanced;

import java.util.UUID;

//Exception Chaining and Context Preservation
/**
 * Context Preservation (ContextPreservingException)
 * Attaches additional context to exceptions
 * Generate unique trace ID
 * Preserve contextual information for debugging
 * */
public class ContextPreservingException extends Exception {
    private final UUID traceId;
    private final ErrorContext context;

    public ContextPreservingException(String message, Throwable cause, ErrorContext context) {
        super(message, cause);
        this.traceId = UUID.randomUUID();
        this.context = context;
    }

    public UUID getTraceId() {
        return traceId;
    }

    public ErrorContext getContext() {
        return context;
    }

    public static class ErrorContext {
        private String userId;
        private String requestId;
        private String additionalInfo;

        public ErrorContext withUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public ErrorContext withRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ErrorContext withAdditionalInfo(String info) {
            this.additionalInfo = info;
            return this;
        }

        @Override
        public String toString() {
            return String.format(
                    "Context[userId=%s, requestId=%s, additionalInfo=%s]",
                    userId, requestId, additionalInfo
            );
        }
    }
}
