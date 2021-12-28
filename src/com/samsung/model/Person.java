package com.samsung.model;

import com.samsung.service.PersonPrinter;
import com.samsung.service.Printer;

public class Person implements Printer {
    private String firstName;
    private String secondName;
    private int age;
    private String phone;

    public Person(String firstName, String secondName, int age, String phone) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.phone = phone;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void printInfo() {
        System.out.println("Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}');
    }
}
