package org.aston;

import org.aston.lesson6.Person;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иван", "Иванович", "Иванов", "инженер",
                "ivanov@gmail.com", "854238458", new BigDecimal(80_000), 35);
        persArray[1] = new Person("Олег", "Петрович", "Сидоров", "руководитель проекта",
                "sidorov@gmail.com", "83841948619", new BigDecimal(90_000), 27);
        persArray[2] = new Person("Петр", "Александрович", "Мелехов", "испытатель",
                "melehov@gmail.com", "836434524", new BigDecimal(100_000), 55);
        persArray[3] = new Person("Сергей", "Сергеевич", "Сазанов", "водитель",
                "sazanov@gmail.com", "8634748", new BigDecimal(70_000), 26);
        persArray[4] = new Person("Алексей", "Анатольевич", "Глушков", "механик",
                "giushov@gmail.com", "8234784", new BigDecimal(75_000), 45);
    }
}