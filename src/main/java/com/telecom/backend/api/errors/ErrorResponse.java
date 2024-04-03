package com.telecom.backend.api.errors;

import java.util.List;

public class ErrorResponse {
    private String errorCode;
    private String errorMessage;
    List<ErrorDetail> errorDetails;

    public List<ErrorDetail> getErrorDetails() {
        return errorDetails;
    }
    public void setErrorDetails(List<ErrorDetail> errorDetails) {
        this.errorDetails = errorDetails;
    }
    public ErrorResponse() {

    }
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
