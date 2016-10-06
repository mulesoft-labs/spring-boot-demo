package com.mulesoft.colt.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("payments")
public interface PaymentClient {

    @RequestMapping(value = "/payments")
    List<Payment> getPayments();
}
