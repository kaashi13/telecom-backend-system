package com.telecom.backend.api.entity;

import com.telecom.backend.api.dto.PaymentDetailsRequestDTO;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "payment")
public class Payment {
    @Id
    private String paymentId;
    private String paymentMethodToken;
    private String merchantName;
    private Boolean isCommitted;
    private Number amount;

    public Payment() {
    }

    public Payment(PaymentDetailsRequestDTO paymentDetailsRequestDTO) {
        this.paymentId = paymentDetailsRequestDTO.getPaymentId();
        this.paymentMethodToken = paymentDetailsRequestDTO.getPaymentMethodToken();
        this.merchantName = paymentDetailsRequestDTO.getMerchantName();
        this.isCommitted = paymentDetailsRequestDTO.getIsCommitted();
        this.amount = paymentDetailsRequestDTO.getAmount();
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentMethodToken() {
        return paymentMethodToken;
    }

    public void setPaymentMethodToken(String paymentMethodToken) {
        this.paymentMethodToken = paymentMethodToken;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Boolean getIsCommitted() {
        return isCommitted;
    }

    public void setIsCommitted(Boolean committed) {
        isCommitted = committed;
    }

    public Number getAmount() {
        return amount;
    }

    public void setAmount(Number amount) {
        this.amount = amount;
    }
}
