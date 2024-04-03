package com.telecom.backend.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.backend.api.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {
}
