package com.pragma.payments;

import com.pragma.payments.application.PaymentService;
import com.pragma.payments.domain.Payment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
class PaymentServiceTest {
    @Autowired
    private PaymentService paymentService;

    @Test
    void processPayment() {
        Payment payment = new Payment();
        payment.setAmount("100");
        payment.setCurrency("USD");
        Mono<Payment> result = paymentService.processPayment(payment);
        StepVerifier.create(result)
               .expectNextMatches(p -> p.getAmount().equals("100"))
               .verifyComplete();
    }
}