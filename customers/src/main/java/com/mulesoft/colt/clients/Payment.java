package com.mulesoft.colt.clients;

import java.util.Map;

public class Payment {
    private String customerId;
    private Map<String, Double> detail;

    public Payment() {
    }

    public Payment(String customerId, Map<String, Double> detail) {
        this.customerId = customerId;
        this.detail = detail;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setDetail(Map<String, Double> detail) {
        this.detail = detail;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Map<String, Double> getDetail() {
        return detail;
    }
}