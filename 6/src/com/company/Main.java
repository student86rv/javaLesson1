package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int m = 5;
        int n = 6;
        int[][] arr = new int[m][n];
        int[] tmpArr = new int[m * n];

        initArr(arr);

        System.out.println("исходный массив:");
        printArr(arr);
        System.out.println();

        matrixToArr(arr, tmpArr);
        bubbleSort(tmpArr);
        arrToMatrix(tmpArr, arr);

        System.out.println("Сортированный массив:");
        printArr(arr);
    }

    private static void initArr(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    private static void matrixToArr(int[][] matrix, int[] arr) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[i * matrix[0].length + j] = matrix[i][j];
            }
        }
    }

    private static void arrToMatrix(int[] arr, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = arr[i * matrix[0].length + j];
            }
        }
    }

    private static void bubbleSort(int arr[]) {
        int tmpTmp;
        for (int i = arr.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmpTmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmpTmp;
                }
            }
        }
    }
}
