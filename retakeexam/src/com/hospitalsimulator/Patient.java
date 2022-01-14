package com.hospitalsimulator;

import java.util.Random;

public class Patient {
    private int patientSeverity;
    private int treat;

    public Patient() {
        this.patientSeverity = new Random().nextInt(1, 10);

    }

    public int getPatientSeverity() {
        return patientSeverity;
    }

    public void treat() throws Exception {
        if (patientSeverity >= 1) {
            patientSeverity--;
        } else {
            throw new Exception("treat cant go below zero.");
        }
    }
}
