package com.stella.score;

public class ScoringNG {
    public static void main(String[] args) {
        String[] names = {"Jack", "Hank", "Karen", "Elva", "Benny"};
        int[] english = {70, 80, 90, 60, 40};
        int[] math = {88, 97, 54, 32, 44 };

        for (int i = 0; i < 5; i++) {
            if(i!=1) {
                System.out.println(names[i] + "\t" + english[i] + "\t" + math[i] + "\t" + (english[i] + math[i]) / 2);
            }
        }
    }
}
