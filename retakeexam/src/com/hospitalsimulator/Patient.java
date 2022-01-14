package com.hospitalsimulator;

import java.util.Random;

public class Patient {
    private int patientSeverity;
    private int treat;

    public Patient() {
        this.patientSeverity = new Random().nextInt(1,10);
        System.out.println(patientSeverity);
    }
    public int getSeverinity(){
        return patientSeverity;
    }

    public static void main(String[] args) {
        Patient patient = new Patient();
        System.out.println(patient);
    }


}
