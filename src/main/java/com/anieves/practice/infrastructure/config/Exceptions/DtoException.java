package com.anieves.practice.infrastructure.config.Exceptions;

public class DtoException extends Exception{
    public DtoException() {
    }

    public DtoException(String message) {
        super(message);
    }

    public DtoException(String message, Throwable cause) {
        super(message, cause);
    }

    public DtoException(Throwable cause) {
        super(cause);
    }

    public DtoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
