package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];
        int sum = 0;
        double meanArr;
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(10) + 10;
            sum += numbers[i];
        }
        meanArr = (double)sum / numbers.length;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Среднее значение: "+meanArr);
    }
}
