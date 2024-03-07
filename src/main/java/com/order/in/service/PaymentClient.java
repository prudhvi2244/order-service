package com.order.in.service;

import com.order.in.common.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "PAYMENT-SERVICE",url="http://13.126.4.93:9092")
public interface PaymentClient {

    @PostMapping(value = "/payment/makePayment")
    Payment makePayment(@RequestBody Payment payment);

}
