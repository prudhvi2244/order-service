package com.order.in.service;

import com.order.in.common.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "payment-service-container")
public interface PaymentClient {

    @PostMapping(value = "/payment/makePayment")
    public Payment makePayment(@RequestBody Payment payment);

}
