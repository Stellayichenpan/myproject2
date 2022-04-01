package com.stella.sales;

public class SliverCustomer extends Customer{
    int GiveMoney;
    public SliverCustomer(String id, int amount) {
        super(id, amount);
    }
    @Override
    public void print() {
        System.out.println(id + "\t" + amount + "\t" + (amount-offMoney()));
    }

}
