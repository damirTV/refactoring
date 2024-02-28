package com.javaacademy;

public class GarbageNotRefactorableException extends Exception {
    public GarbageNotRefactorableException() {
    }

    public GarbageNotRefactorableException(String message) {
        super(message);
    }

    public GarbageNotRefactorableException(String message, Throwable cause) {
        super(message, cause);
    }

    public GarbageNotRefactorableException(Throwable cause) {
        super(cause);
    }

    public GarbageNotRefactorableException(String message, Throwable cause,
                                           boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
