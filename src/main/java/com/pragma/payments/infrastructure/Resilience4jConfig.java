package com.pragma.payments.infrastructure;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;

@Configuration
public class Resilience4jConfig {
    @Bean
    public Resilience4JCircuitBreakerFactory resilience4JCircuitBreakerFactory() {
        return new Resilience4JCircuitBreakerFactory().configureDefault(id -> new Resilience4JConfigBuilder(id)
               .circuitBreakerConfig(CircuitBreakerConfig.ofDefaults())
               .timeLimiterConfig(TimeLimiterConfig.custom().timeoutDuration(Duration.ofSeconds(1)).build())
               .build());
    }
}