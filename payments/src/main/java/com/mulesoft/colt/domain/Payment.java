package com.mulesoft.colt.domain;


import java.util.Map;

public class Payment {
    private String customerId;
    private Map<String, Double> detail;

    public Payment(String customerId, Map<String, Double> detail) {
        this.customerId = customerId;
        this.detail = detail;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Map<String, Double> getDetail() {
        return detail;
    }
}
