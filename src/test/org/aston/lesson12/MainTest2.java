package org.aston.lesson12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest2 {
    @Test
    public void positiveValueFactorial() {
        int expected = 120;
        int actual = Main.factorial(5);
        Assert.assertEquals(expected, actual);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void factorialNegativeValue() {
        int expected = Main.factorial(-3);
    }

    @Test
    public void factorialZeroValue() {
        int expected = 1;
        int actual = Main.factorial(0);
        Assert.assertEquals(expected, actual);
    }
}