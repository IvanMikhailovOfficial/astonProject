package org.aston.lesson12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Тест метода факториал на работу с позитивными значениями")
    public void factorialPositiveValue() {
        int expected = 120;
        int actual = Main.factorial(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Тест метода факториал на работу с негативными значениями")
    public void factorialNegativeValue() {
        IllegalArgumentException e = Assertions.assertThrows(
                IllegalArgumentException.class, () -> Main.factorial(-3));
        Assertions.assertEquals("Число меньше нуля", e.getMessage());
    }

    @Test
    @DisplayName("Тест метода факториал на работу со значением ноль")
    public void factorialZeroValue() {
        int expected = 1;
        int actual = Main.factorial(0);
        Assertions.assertEquals(expected, actual);
    }
}