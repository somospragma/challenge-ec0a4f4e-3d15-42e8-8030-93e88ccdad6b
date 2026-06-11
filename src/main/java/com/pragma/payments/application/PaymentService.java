package com.pragma.payments.application;

import com.pragma.payments.domain.Payment;
import com.pragma.payments.infrastructure.PaymentRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Mono<Payment> processPayment(Payment payment) {
        // Idempotence logic here
        return paymentRepository.save(payment);
    }
}