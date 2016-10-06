package com.mulesoft.colt.domain;


public class Customer {
    private String id;
    private String name;
    private boolean hasPayments;

    public Customer(String customerId, String name, boolean hasPayments) {
        this.id = customerId;
        this.name = name;
        this.hasPayments = hasPayments;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public boolean isHasPayments() {
        return hasPayments;
    }
}
