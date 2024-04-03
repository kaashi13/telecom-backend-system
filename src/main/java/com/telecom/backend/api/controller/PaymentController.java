package com.telecom.backend.api.controller;

import com.telecom.backend.api.dto.PaymentDetailsRequestDTO;
import com.telecom.backend.api.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap; 




@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/details")
    public ResponseEntity<String> processPayment(@Validated @RequestBody PaymentDetailsRequestDTO paymentDetailsDTO) {
        throw new IllegalArgumentException("Exception thrown from the Payment Controller");
    //     paymentService.processPaymentDetails(paymentDetailsDTO);
    //    return new ResponseEntity<>("Payment Processed", HttpStatus.OK);
    }
}
