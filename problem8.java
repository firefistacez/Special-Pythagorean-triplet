package com.example;

public class problem8 {
    public static void main(String[] args) {
        int sum = 1000;
        for(int a = 1;a<=sum/3;a+=1) {
            for (int b = 1; b <= sum / 2; b += 1) {
                int c = sum - a - b;
                if ((a * a) + (b * b) == (c * c)) {
                    System.out.println(a*b*c);
                }
            }
        }
    }
}
