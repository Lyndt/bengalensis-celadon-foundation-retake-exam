package com.hospitalsimulator;

import java.util.Random;

public class Patient {
    private int getSeverity;
    private int treat;

    public Patient() {
        this.getSeverity = new Random().nextInt(1,10);
    }

}
