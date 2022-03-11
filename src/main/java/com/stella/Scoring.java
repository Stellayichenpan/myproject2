package com.stella;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack", 50, 28);
       /* jack.name = "Jack";
        jack.english = 70;
        jack.math = 88;*/
        Student hank = new Student("Hank", 80, 97);
        GraduateStudent jane =
                new GraduateStudent("Jane", 65, 82,95);
        jane.name = "Jane";
        jack.print();
        hank.print();
        jane.print();
    }
}
