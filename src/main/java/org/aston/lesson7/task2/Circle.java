package org.aston.lesson7.task2;

public class Circle extends BaseFigure {
    protected double radius;

    public Circle(String color, String borderColor, double radius) {
        super(color, borderColor);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void fillColor(String color) {
        this.color = color;
        System.out.println("Круг закрашен в " + color + " цвет");
    }

    @Override
    public void fillBorderColor(String color) {
        this.color = color;
        System.out.println("Граница круга закрашена в " + color + " цвет");
    }


    @Override
    public void getInfo() {
        System.out.printf("Результат полученных характеристик круга: " +
                " периметр %.2f, " +
                " площадь %.2f, " +
                " цвет фона %s, " +
                " цвет границ %s " +
                "\n", getPerimeter(), getArea(), color, borderColor);
    }
}
