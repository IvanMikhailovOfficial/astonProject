package org.aston;

import org.aston.lesson6.Person;

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иван", "Иванович", "Иванов", "инженер", "ivanov@gmail.com", "854238458", 80_000L, 35);
        persArray[1] = new Person("Олег", "Петрович", "Сидоров", "руководитель проекта", "sidorov@gmail.com", "83841948619", 90_000L, 27);
        persArray[2] = new Person("Петр", "Александрович", "Мелехов", "испытатель", "melehov@gmail.com", "836434524", 100_000L, 55);
        persArray[3] = new Person("Сергей", "Сергеевич", "Сазанов", "водитель", "sazanov@gmail.com", "8634748", 70_000L, 26);
        persArray[4] = new Person("Алексей", "Анатольевич", "Глушков", "механик", "giushov@gmail.com", "8234784", 75_000L, 45);
    }
}