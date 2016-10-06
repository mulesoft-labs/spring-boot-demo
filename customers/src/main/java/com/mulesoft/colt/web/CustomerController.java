package com.mulesoft.colt.web;

import com.mulesoft.colt.clients.PaymentClient;
import com.mulesoft.colt.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    public PaymentClient paymentClient;

    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public @ResponseBody
    Customer getCustomers(@PathVariable(value="customerId") String customerId) {
        return new Customer(customerId, "fefe", paymentClient.getPayments().isEmpty() );
    }

}
