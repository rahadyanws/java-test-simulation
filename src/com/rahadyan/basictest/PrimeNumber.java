package com.rahadyan.basictest;

public class PrimeNumber {
    public static void main(String[] args) {
        int bilangan;
        for (int i = 0; i <= 20; i++) {
            bilangan = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    bilangan = bilangan + 1;
                }
            }
            if (bilangan == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
