package com.va.week5.lab3.RananjayC.HospitalManagementSystem;

public class Doctor extends Person {
    private String specialization;
    private double consultationFee;

    public Doctor(int personId, String name, int age,
                  String specialization, double consultationFee) {
        super(personId, name, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void diagnosePatient() {
        System.out.println(
            getName() + " is diagnosing a patient in " + specialization + "."
        );
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
        System.out.printf("Consultation fee: $%.2f%n", consultationFee);
    }

    @Override
    public void performDuties() {
        System.out.println(
            getName() + " is examining patients and providing treatment."
        );
    }
}
