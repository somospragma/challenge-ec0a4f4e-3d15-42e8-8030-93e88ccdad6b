package com.pragma.payments.infrastructure;

import com.pragma.payments.application.PaymentService;
import com.pragma.payments.domain.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class PaymentHandler {
    private final PaymentService paymentService;

    @Autowired
    public PaymentHandler(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public Mono<ServerResponse> handlePayment(ServerRequest request) {
        Mono<Payment> paymentMono = request.bodyToMono(Payment.class);
        return paymentMono.flatMap(payment -> paymentService.processPayment(payment)
               .flatMap(savedPayment -> ServerResponse.ok().bodyValue(savedPayment)))
               .onErrorResume(throwable -> ServerResponse.status(500).bodyValue(throwable.getMessage()));
    }
}