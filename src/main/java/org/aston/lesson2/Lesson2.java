package org.aston.lesson2;

import java.util.Arrays;

public class Lesson2 {
    // метод задачи № 1:
    public static void printThreeWords() {
        String[] food = {"Orange", "Banana", "Apple"};

        for (String element : food) {
            System.out.println(element);
        }
    }
    // метод задачи № 2:
    public static void checkSumSign() {
        int a = 45_000_000;
        int b = 54_000_000;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // метод задачи № 3:
    public static void printColor() {
        int value = 35_789;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    // метод задачи № 4:
    public static void compareNumbers() {
        int a = 17_789;
        int b = 82_562;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    // метод задачи № 5:
    public static boolean checkAmountRange(int number1, int number2) {
        int sum = number1 + number2;

        return sum >= 10 && sum <= 20;
    }
    // метод задачи № 6:
    public static void checkPositiveOrNegativeNumber(int number) {

        if (number >= 0) {
            System.out.println("В параметре поступило ПОЛОЖИТЕЛЬНОЕ число");
        } else {
            System.out.println("В параметре поступило ОТРИЦАТЕЛЬНОЕ число");
        }
    }
    // метод задачи № 7:
    public static boolean checkNumberIsNegative(int number) {

        return number < 0;
    }
    // метод задачи № 8:
    public static void printLineAnTimes(String str, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
    // метод задачи № 9:
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
    // метод задачи № 10:
    public static int[] updateArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        return array;
    }
    // метод задачи № 11:
    public static int[] fillingTheArray() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
    // метод задачи № 12:
    public static int[] multiplyingBy2AllValuesLessThan6(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }
    // методы задачи № 13:
    public static int[][] fillingTwoDimensionalArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
        return array;
    }

    public static void printArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    // метод задачи № 14:
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}
