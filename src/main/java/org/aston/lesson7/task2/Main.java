package org.aston.lesson7.task2;
// так как не хотелось бы передавать возможности расчета перметра для всех фигур каждому импементирующему классу
// реализавал немножко по другому, однако написал дефолтные методы на случай, если ревьюеру это не понравится
// по сути, сейчас имеется два решения

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("зеленый", "синий", 5.5);
        Rectangle rectangle = new Rectangle("фиолетовый", "черный", 7, 11);
        Triangle triangle = new Triangle("оранжевый", "коричневый", 7.3, 7.1,1.5);

        circle.getInfo();
        rectangle.getInfo();
        triangle.getInfo();
    }
}
