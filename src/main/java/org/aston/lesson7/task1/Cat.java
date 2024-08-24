package org.aston.lesson7.task1;

public class Cat extends Animal {
    private boolean satiety;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Кот не смог преодлотеть расстояние в " + distance + " м.");
        } else {
            System.out.println("Кот преобежал " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }

    public void eat(Dish dish, int foodCount) {
        if (dish.feed(this, foodCount)) {
            System.out.println("Кот " + name + " покушал " + foodCount + " еды");
        } else {
            System.out.println("Кот " + name + " не покушал, так как еды не хватило");
        }

    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
