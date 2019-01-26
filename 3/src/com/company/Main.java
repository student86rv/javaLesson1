package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        isSimple(number);
    }

    public static void isSimple(int number) {
        int count = 0;
        for (int i = number - 1; i > 1 ; i--) {
            if (number % i == 0) {
                System.out.println("Делитель: "+i);
                count ++;
            }
        }
        if (count == 0) {
            System.out.println("Число простое");
        }
    }
}
