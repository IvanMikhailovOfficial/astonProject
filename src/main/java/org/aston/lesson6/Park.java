package org.aston.lesson6;

import java.util.HashMap;

public class Park {
    class Attraction {
        private String name;
        private String description;
        private HashMap<String, String> workSchedule; //ключом является день недели, а значением - время работы
        private int cost;

        public Attraction(String name, String description, HashMap<String, String> workSchedule, int cost) {
            this.name = name;
            this.description = description;
            this.workSchedule = workSchedule;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public HashMap<String, String> getWorkSchedule() {
            return workSchedule;
        }

        public int getCost() {
            return cost;
        }
    }
}
