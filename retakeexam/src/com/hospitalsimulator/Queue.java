package com.hospitalsimulator;

import java.util.ArrayList;
import java.util.List;

abstract public class Queue {
    protected List<Patient> listOfPatients;

    public Queue() {
        listOfPatients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        listOfPatients.add(patient);
    }

    public abstract Patient getNextPatient();


}
