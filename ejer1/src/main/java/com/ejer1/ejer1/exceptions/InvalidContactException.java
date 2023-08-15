package com.ejer1.ejer1.exceptions;

public class InvalidContactException extends RuntimeException{

    private String code;

    public InvalidContactException(String code, String message){
        super(message);
        this.code=code;
    }
}
