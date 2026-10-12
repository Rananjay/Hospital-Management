package com.va.week5.lab3.RananjayC.HospitalManagementSystem;

public class Person {
    private int personId;
    private String name;
    private int age;

    public Person(int personId, String name, int age) {
        this.personId = personId;
        this.name = name;
        this.age = age;
    }

    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayDetails() {
        System.out.println("ID: " + personId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void performDuties() {
        System.out.println(name + " is performing general hospital duties.");
    }
}
