package com.va.week5.lab3.RananjayC.HospitalManagementSystem;

public class Nurse extends Person {
    private String department;
    private String shift;

    public Nurse(int personId, String name, int age,
                 String department, String shift) {
        super(personId, name, age);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public String getShift() {
        return shift;
    }

    public void assistPatient() {
        System.out.println(
            getName() + " is assisting a patient in " + department + "."
        );
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Shift: " + shift);
    }

    @Override
    public void performDuties() {
        System.out.println(
            getName() + " is monitoring patients and supporting doctors."
        );
    }
}
