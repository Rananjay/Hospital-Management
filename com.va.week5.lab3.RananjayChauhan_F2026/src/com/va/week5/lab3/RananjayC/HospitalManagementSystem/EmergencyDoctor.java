package com.va.week5.lab3.RananjayC.HospitalManagementSystem;

public class EmergencyDoctor extends Doctor
implements MedicalProfessional, Billable {

public EmergencyDoctor(int personId, String name, int age,
                   String specialization, double consultationFee) {
super(personId, name, age, specialization, consultationFee);
}

public void handleEmergency() {
System.out.println(
    getName() + " is handling an emergency and stabilizing a patient."
);
}

@Override
public void prescribeMedication() {
System.out.println(
    getName() + " is prescribing medication for an emergency patient."
);
}

@Override
public void generateBill() {
System.out.printf(
    "Emergency consultation bill from %s: $%.2f%n",
    getName(), getConsultationFee()
);
}

@Override
public void displayDetails() {
super.displayDetails();
System.out.println("Role: Emergency Doctor");
}

@Override
public void performDuties() {
System.out.println(
    getName() + " is providing urgent care to emergency patients."
);
}
}
