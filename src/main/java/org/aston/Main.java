package org.aston;

import org.aston.lesson2.Lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayTask10 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arrayTask12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] arrayTask13 = new int[7][7];

        System.out.println("Результат работы метода задачи № 1: ");
        Lesson2.printThreeWords();
        System.out.println();

        System.out.println("Результат работы метода задачи № 2: ");
        Lesson2.checkSumSign();
        System.out.println();

        System.out.println("Результат работы метода задачи № 3: ");
        Lesson2.printColor();
        System.out.println();

        System.out.println("Результат работы метода задачи № 4: ");
        Lesson2.compareNumbers();
        System.out.println();

        System.out.println("Результат работы метода задачи № 5: ");
        System.out.println(Lesson2.checkAmountRange(3, 9));
        System.out.println();

        System.out.println("Результат работы метода задачи № 6: ");
        Lesson2.checkPositiveOrNegativeNumber(9);
        System.out.println();

        System.out.println("Результат работы метода задачи № 7: ");
        System.out.println(Lesson2.checkNumberIsNegative(-3));
        System.out.println();

        System.out.println("Результат работы метода задачи № 8: ");
        Lesson2.printLineAnTimes("Я люблю Java и Aston", 3);
        System.out.println();

        System.out.println("Результат работы метода задачи № 9: ");
        System.out.println(Lesson2.isLeapYear(2000));
        System.out.println();

        System.out.println("Результат работы метода задачи № 10: ");
        System.out.println(Arrays.toString(Lesson2.updateArray(arrayTask10)));
        System.out.println();

        System.out.println("Результат работы метода задачи № 11: ");
        System.out.println(Arrays.toString(Lesson2.fillingTheArray()));
        System.out.println();

        System.out.println("Результат работы метода задачи № 12: ");
        System.out.println(Arrays.toString(Lesson2.multiplyingBy2AllValuesLessThan6(arrayTask12)));
        System.out.println();

        System.out.println("Результат работы метода задачи № 13: ");
        Lesson2.fillingTwoDimensionalArray(arrayTask13);
        Lesson2.printArray(arrayTask13);
        System.out.println();

        System.out.println("Результат работы метода задачи № 14: ");
        System.out.println(Arrays.toString(Lesson2.createArray(3, 8888888)));
        System.out.println();
    }
}