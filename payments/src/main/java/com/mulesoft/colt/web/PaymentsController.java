package com.mulesoft.colt.web;

import com.mulesoft.colt.domain.Payment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class PaymentsController {

    @RequestMapping(value = "/payments", method = RequestMethod.GET)
    public @ResponseBody
    List<Payment> getPayments() {
        List<Payment> payments = new ArrayList<>();
        HashMap<String, Double> paymentDetails = new HashMap<>();
        paymentDetails.put("Restaurant", new Double(18.5));
        paymentDetails.put("VideoGames", new Double(12.5));
        payments.add(new Payment("d8960d30-8a63-11e6-ae22-56b6b6499611", paymentDetails));
        return payments;
    }

}
