package org.aston.lesson7.task1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Собака не смогла преодлотеть расстояние в " + distance + " м.");
        } else {
            System.out.println("Собака преобежала " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Собака не смогла проплыть расстояние в " + distance + " м.");
        } else {
            System.out.println("Собака смогла проплыть " + distance + " м.");
        }
    }
}
