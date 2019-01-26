package com.company;

public class Main {

    public static void main(String[] args) {

        String number;
        for (int i = 1; i <= 100 ; i++) {
            number = "" + i;
            if (i % 3 == 0) {
                number = "Hello";
            }
            if (i % 5 == 0) {
                number = "World";
            }
            if (i % 3 == 0 && i % 5 == 0) {
                number = "HelloWorld";
            }
            System.out.print(number + ", ");
        }
    }
}
