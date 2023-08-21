package com.devsuperior.calculateproducts.entities;

public class Order {
    private int code;
    private double basic;
    private double discount;

    public Order() {
    }

    public Order(int code, double basic, double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public int getCode() {
        return code;
    }

    public double getBasic() {
        return basic;
    }

    public double getDiscount() {
        return discount;
    }

}
