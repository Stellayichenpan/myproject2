package com.stella.sales;

public class Customer {
    String name;
    int spend;
    int discount;
    public Customer(String name, int spend) {
        this.name = name;
        this.spend = spend;

    }
    public int CaculateDiscount() {
        int cal = spend/1000;
        if ((spend/1000)>= 1) {
            discount = cal*100;
        }
        return discount;
    }
    public void print() {
        int discount = CaculateDiscount();
        System.out.println(name +"\t" + spend + "\t" + (spend-discount));
    }
}
