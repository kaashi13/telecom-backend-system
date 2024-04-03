package com.telecom.backend.api.service;

import com.telecom.backend.api.dto.PaymentDetailsRequestDTO;
import com.telecom.backend.api.entity.Payment;
import com.telecom.backend.api.repository.PaymentRepository;
import com.telecom.backend.api.storage.TemporaryPaymentStorage;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Transactional
    public void processPaymentDetails(PaymentDetailsRequestDTO paymentDetailsDTO) {

        if (paymentDetailsDTO.getIsCommitted()) {
            saveToDatabase(paymentDetailsDTO);
        } else {
            TemporaryPaymentStorage.storeTemporaryPayment(paymentDetailsDTO);
        }
    }

    private void saveToDatabase(PaymentDetailsRequestDTO paymentDetailsDTO) {
         Payment payment = convertToPaymentEntity(paymentDetailsDTO);
         // Check if it was previously temporary
         PaymentDetailsRequestDTO temp = TemporaryPaymentStorage.retrieveTemporaryPayment(payment.getPaymentId());
         if (temp != null) {
             // Merge any updated values if needed
         }
         paymentRepository.save(payment);
    }

    public Payment convertToPaymentEntity(PaymentDetailsRequestDTO paymentDetailsDTO) {
        return new Payment(paymentDetailsDTO);
    }
    
}
