package org.aston.lesson7.task1;

public abstract class Animal {
    protected static int counter;
    protected String name;

    public Animal(String name) {
        counter++;
        this.name = name;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }
}
