package com.javaacademy;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GarbageNotRefactorableException extends Exception {
    String message;
    Throwable cause;
    boolean enableSuppression;
    boolean writableStackTrace;

    @Builder
    public GarbageNotRefactorableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message;
        this.cause = cause;
        this.enableSuppression = enableSuppression;
        this.writableStackTrace = writableStackTrace;
    }
}
