package com.samsung;

import com.samsung.model.Person;
import com.samsung.model.Student;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("andy", "scott", 16, "88005553535");
        Person p1 = new Person("andy", "scott", 16);
        p.printInfo();
        p1.printInfo();
        Student s = new Student("andy", "scott", 16, "88005553535", "21C", 123);
        s.printInfo();
    }
}
