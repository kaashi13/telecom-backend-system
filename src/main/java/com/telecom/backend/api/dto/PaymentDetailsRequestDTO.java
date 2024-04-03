package com.telecom.backend.api.dto;

import javax.validation.constraints.NotNull;


public class PaymentDetailsRequestDTO {
    @NotNull
    private String paymentId;
    private String paymentMethodToken;
    private String merchantName;
    private Boolean isCommitted;
    private Number amount;

    public String getPaymentId() {
        return paymentId;
    }

    public String getPaymentMethodToken() {
        return paymentMethodToken;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public Boolean getIsCommitted() {
        return isCommitted;
    }

    public Number getAmount() {
        return amount;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setPaymentMethodToken(String paymentMethodToken) {
        this.paymentMethodToken = paymentMethodToken;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public void setIsCommitted(Boolean isCommitted) {
        this.isCommitted = isCommitted;
    }

    public void setAmount(Number amount) {
        this.amount = amount;
    }
}
