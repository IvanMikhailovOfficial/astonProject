package org.aston.lesson8;

import org.aston.lesson8.exceptions.MyArrayDataException;
import org.aston.lesson8.exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] arr1 = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        String[][] arr2 = {
                {"1", "2", "слово", "4"},
                {"слово", "6", "Y", "8"},
                {"9", "W", "слово", "12"},
                {"13", "14", "слово", "слово"}
        };

        String[][] arr3 = {
                {"1", "2", "слово", "4"},
                {"слово", "6", "Y", "8"}
        };

        System.out.println(sum(arr1));
        System.out.println(sum(arr2));
        System.out.println(sum(arr3));
    }

    public static int sum(String[][] arr) {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Массив имеет другой размер");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Массив имеет другой размер");
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].matches("[0-9]+")) {
                    sum += Integer.parseInt(arr[i][j]);
                } else {
                    throw new MyArrayDataException("В строке " + i + " и стобце " + j + " символ или текст");
                }
            }
        }
        return sum;
    }
}
