package com.stella.sales;

//  一般客戶 - 滿千送百
//  銀級客戶 - 滿千送百, 再送百元還元金
//  金級客戶 - 滿千送二百，再送二百還元金
//  added after:
//  customer get 10% off discount
//  customer get 30% off and 20% point
//  0001  1200  1100
//  0002   800   800
//  0003  2000  1800(200)  <--銀級客戶
//  0004  5000  4000(1000) <--金級客戶
public class SalesTester {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001", 1200);
        Customer c2 = new Customer("0002", 800);
        SliverCustomer c3 = new SliverCustomer("0003", 2000);
        GoldenCustomer c4 = new GoldenCustomer("0004", 5000);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
    }
}