package javaTest.lesson12_jupiter;

import javaTest.aston.lesson12.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTestJupiter {
    @Test
    @DisplayName("Тест метода факториал на работу с позитивными значениями")
    public void factorialPositiveValue() {
        int expected = 120;
        int actual = Main.factorial(5);
        Assertions.assertEquals(expected, actual, "Факториал 5 должен быть равен 120");
    }

    @Test
    @DisplayName("Тест метода факториал на работу с негативными значениями")
    public void testFactorialOfNegativeNumber() {
        IllegalArgumentException e = Assertions.assertThrows(
                IllegalArgumentException.class, () -> Main.factorial(-3));
        Assertions.assertEquals("Число меньше нуля", e.getMessage(),
                "Текст выбрасываемого исключения не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Тест метода факториал на работу со значением ноль")
    public void testFactorialOfZero() {
        int expected = 1;
        int actual = Main.factorial(0);
        Assertions.assertEquals(expected, actual, "Факториал 0 не равен 1");
    }
}
