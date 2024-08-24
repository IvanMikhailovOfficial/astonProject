package org.aston.lesson7.task1;

public class Main {
    public static void main(String[] args) {
        Cat[] arrCat = {
                new Cat("Барсик"),
                new Cat("Том"),
                new Cat("Мурзик")
        };

        Dish dish = new Dish();
        dish.addFood(25);

        for (int i = 0; i < arrCat.length; i++) {
            arrCat[i].eat(dish, 10);
        }
    }
}
