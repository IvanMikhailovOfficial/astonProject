package org.aston.lesson6;

public class Person {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String post;
    private String email;
    private String telephone;
    private Long salary;
    private int age;

    public Person(String firstName, String lastName, String patronymic,
                  String post, String email, String telephone, Long salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public Long getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void showInfoEmployee() {
        System.out.println(firstName + " " + lastName + " " + patronymic + " " + post +
                " " + email + " " + salary + " " + age);
    }
}
