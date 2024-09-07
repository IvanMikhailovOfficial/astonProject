package org.aston.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TelephoneBook {
    protected Map<String, List<String>> contacts = new TreeMap<>();

    public void addContacts(String lastName, String telephone) {
        if (contacts.containsKey(lastName)) {
            if (!contacts.get(lastName).contains(telephone)) {
                contacts.get(lastName).add(telephone);
            } else {
                System.out.println("Такой номер телефона уже присутствует у данного контакта");
            }
        } else {
            contacts.put(lastName, new ArrayList<>(List.of(telephone)));
        }
    }

    public void printAllContacts() {

        for (Map.Entry<String, List<String>> contact : contacts.entrySet()) {
            System.out.println("Контакт " + contact.getKey() + " список номеров:" + contact.getValue());
        }
    }

    public List<String> searchContactByLastName(String lastName) {

        for (Map.Entry<String, List<String>> contact : contacts.entrySet()) {
            if (contact.getKey().equals(lastName)) {
                return contact.getValue();
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        TelephoneBook book = new TelephoneBook();
        book.addContacts("Иванов", "890687959");
        book.addContacts("Петров", "820689999");
        book.addContacts("Сидоров", "81385589");
        book.addContacts("Иванов", "89033435439");
        System.out.println();
        book.printAllContacts();
        System.out.println();
        String lastName = "Иванов";
        System.out.println("Контакту " + lastName + " принадлежат телефон(ы):" + book.searchContactByLastName(lastName));
    }
}
