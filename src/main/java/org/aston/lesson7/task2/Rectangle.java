package org.aston.lesson7.task2;

public class Rectangle extends BaseFigure {
    protected double height;
    protected double width;

    public Rectangle(String color, String borderColor, double height, double width) {
        super(color, borderColor);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void fillColor(String color) {
        this.color = color;
        System.out.println("Прямоугольник закрашен в " + color + " цвет");
    }

    @Override
    public void fillBorderColor(String color) {
        this.color = color;
        System.out.println("Граница прямоугольника закрашена в " + color + " цвет");
    }

    @Override
    public void getInfo() {
        System.out.printf("Результат полученных характеристик прямоугольника: " +
                " периметр %.2f, " +
                " площадь %.2f, " +
                " цвет фона %s, " +
                " цвет границ %s " +
                "\n", getPerimeter(), getArea(), color, borderColor);
    }
}
