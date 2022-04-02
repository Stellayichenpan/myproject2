package com.stella.sales;

public class DiscountCustomer extends Customer{
    public DiscountCustomer(String id, int amount) {
        super(id, amount);
        off = 0.9f;
    }
    @Override
    public void print() {
        System.out.println(id + "\t" + amount + "\t" + (amount - backMoney()));
    }
}
