package org.aston.lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Park {
    class Attraction {
        private String name;
        private String description;
        private List<Attraction> listOfAttractions;
        private Map<String, String> workSchedule; //ключом является день недели, а значением - время работы
        private int cost;

        public Attraction(String name, String description, int cost) {
            this.name = name;
            this.description = description;
            this.cost = cost;
            listOfAttractions = new ArrayList<>();
            workSchedule = new HashMap<>();
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public List<Attraction> getListOfAttractions() {
            return listOfAttractions;
        }

        public Map<String, String> getWorkSchedule() {
            return workSchedule;
        }

        public int getCost() {
            return cost;
        }
    }
}
