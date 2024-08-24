package org.aston.lesson7.task2;

public abstract class BaseFigure implements Figure {
    protected String color;
    protected String borderColor;

    public BaseFigure(String color, String borderColor) {
        this.color = color;
        this.borderColor = borderColor;
    }

    public abstract void getInfo();
}
