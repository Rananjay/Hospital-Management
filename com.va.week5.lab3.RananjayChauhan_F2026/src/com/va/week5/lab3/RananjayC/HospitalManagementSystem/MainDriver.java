package com.va.week5.lab3.RananjayC.HospitalManagementSystem;

public class MainDriver {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(
            101, "Dr. Chauhan", 45, "Cardiology", 150.00
        );

        Nurse nurse = new Nurse(
            102, "Dr Kushwaha", 30, "Intensive Care", "Night"
        );

        Surgeon surgeon = new Surgeon(
            103, "Dr. Patel", 50, "General Surgery", 250.00,
            "Appendectomy", "OR-2"
        );

        EmergencyDoctor emergencyDoctor = new EmergencyDoctor(
            104, "Dr. Han lee", 38, "Emergency Medicine", 200.00
        );

        System.out.println("=== DOCTOR ===");
        doctor.displayDetails();
        doctor.diagnosePatient();
        doctor.performDuties();

        System.out.println("\n=== NURSE ===");
        nurse.displayDetails();
        nurse.assistPatient();
        nurse.performDuties();

        System.out.println("\n=== SURGEON ===");
        surgeon.displayDetails();
        surgeon.diagnosePatient();
        surgeon.performSurgery();
        surgeon.performDuties();

        System.out.println("\n=== EMERGENCY DOCTOR ===");
        emergencyDoctor.displayDetails();
        emergencyDoctor.diagnosePatient();
        emergencyDoctor.handleEmergency();
        emergencyDoctor.prescribeMedication();
        emergencyDoctor.generateBill();
        emergencyDoctor.performDuties();

        System.out.println("\n=== POLYMORPHISM: PERSON REFERENCE ===");

        Person person;

        person = doctor;
        person.performDuties();

        person = nurse;
        person.performDuties();

        person = surgeon;
        person.performDuties();

        person = emergencyDoctor;
        person.performDuties();

        System.out.println("\n=== INTERFACE REFERENCES ===");

        MedicalProfessional professional = emergencyDoctor;
        professional.prescribeMedication();

        Billable billable = emergencyDoctor;
        billable.generateBill();
    }
}
