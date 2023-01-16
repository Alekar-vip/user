package com.anieves.practice.infrastructure.config.Exceptions;

public class UseCaseExceptions extends Exception{
    public UseCaseExceptions() {
    }

    public UseCaseExceptions(String message) {
        super(message);
    }

    public UseCaseExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public UseCaseExceptions(Throwable cause) {
        super(cause);
    }

    public UseCaseExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
