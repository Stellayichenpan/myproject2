package com.stella;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack");
       // jack.name = "Jack";
        jack.english = 70;
        jack.math = 88;
        Student hank = new Student("Hank",80,97);
        jack.print();
        hank.print();
    }
}
