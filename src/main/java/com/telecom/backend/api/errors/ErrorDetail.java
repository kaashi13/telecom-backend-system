package com.telecom.backend.api.errors;

public class ErrorDetail {
    
    private String field;
    private String message;

    public ErrorDetail () {
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setMessage(String field) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}