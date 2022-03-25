package com.stella.ticket;

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;

    int start;
    int distination;
    int price;
    public Ticket(int start,int distination) {
        this.start = start;
        this.distination = distination;
    }

    public void print() {
        //taipeiStation = 105;
    }
}