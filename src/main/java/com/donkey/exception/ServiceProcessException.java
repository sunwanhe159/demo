package com.donkey.exception;

/**
 * Created by sunwh on 2020/5/27.
 */
public class ServiceProcessException extends RuntimeException {

    public ServiceProcessException(String message) {
        super(message);
    }

    public ServiceProcessException(String message, Throwable cause) {
        super(message, cause);
    }


}

