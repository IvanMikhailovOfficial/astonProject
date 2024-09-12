package javaTest.lesson12_testNG;

import javaTest.aston.lesson12.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTestTestNG {
    @Test
    public void positiveValueFactorial() {
        int expected = 120;
        int actual = Main.factorial(5);
        Assert.assertEquals(expected, actual, "Факториал 5 должен быть равен 120");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        Main.factorial(-3);
    }

    @Test
    public void testFactorialOfZero() {
        int expected = 1;
        int actual = Main.factorial(0);
        Assert.assertEquals(expected, actual, "Факториал 0 не равен 1");
    }
}
