package com.wellsfargo.counselor.entity;

public class Security {

    private String ticker;
    private String name;
    private double price;
    private int quantity;

    public Security(String ticker, String name, double price, int quantity) {
        this.ticker = ticker;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTicker() {
        return ticker;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}