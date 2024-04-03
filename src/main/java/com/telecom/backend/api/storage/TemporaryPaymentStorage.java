package com.telecom.backend.api.storage;

import com.telecom.backend.api.dto.PaymentDetailsRequestDTO;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TemporaryPaymentStorage {
    private static final Map<String, PaymentDetailsRequestDTO> temporaryPayments = new ConcurrentHashMap<>();

    public static void storeTemporaryPayment(PaymentDetailsRequestDTO paymentDetails) {
        temporaryPayments.put(paymentDetails.getPaymentId(), paymentDetails);
    }

    public static PaymentDetailsRequestDTO retrieveTemporaryPayment(String paymentId) {
        return temporaryPayments.remove(paymentId);
    }
}

