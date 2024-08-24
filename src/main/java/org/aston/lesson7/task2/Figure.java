package org.aston.lesson7.task2;

public interface Figure {
    double getPerimeter();
    double getArea();
    void fillColor(String color);
    void fillBorderColor(String color);

    default double getCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    default double getRectanglePerimeter(double height, double width) {
        return 2 * (height + width);
    }

    default double getTrianglePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }
}
