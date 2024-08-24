package org.aston.lesson7.task1;

public class Dish {
    private int foodCount;

    public void addFood(int foodCount) {
        if (foodCount > 0) {
            this.foodCount += foodCount;
        }
    }

    public boolean feed(Cat cat, int foodCount) {
        if (this.foodCount >= foodCount) {
            cat.setSatiety(true);
            this.foodCount -= foodCount;
            return true;
        }
        return false;
    }
}