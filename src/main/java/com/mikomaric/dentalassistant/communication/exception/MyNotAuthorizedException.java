package com.mikomaric.dentalassistant.communication.exception;

public class MyNotAuthorizedException extends Exception{

    public MyNotAuthorizedException() {
    }
    
    public MyNotAuthorizedException(String message) {
        super(message);
    }
    
}
