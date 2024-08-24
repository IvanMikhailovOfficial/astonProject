package org.aston.lesson7.task2;

public class Triangle extends BaseFigure {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(String color, String borderColor, double sideA, double sideB, double sideC) {
        super(color, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    @Override
    public void fillColor(String color) {
        this.color = color;
        System.out.println("Треугольник закрашен в " + color + " цвет");
    }

    @Override
    public void fillBorderColor(String color) {
        this.color = color;
        System.out.println("Граница треугольника закрашена в " + color + " цвет");
    }

    @Override
    public void getInfo() {
        System.out.printf("Результат полученных характеристик треугольника: " +
                " периметр %.2f, " +
                " площадь %.2f, " +
                " цвет фона %s " +
                " цвет границ %s " +
                "\n", getPerimeter(), getArea(), color, borderColor);
    }
}
