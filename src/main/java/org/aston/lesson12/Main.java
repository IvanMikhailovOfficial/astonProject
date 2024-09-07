package org.aston.lesson12;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial(int number) {
        int result = 1;

        if (number < 0) {
            throw new IllegalArgumentException("Число меньше нуля");
        }

        if (number == 0) {
            return 1;
        }

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
