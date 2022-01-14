package com.hospitalsimulator;

import java.util.ArrayList;
import java.util.List;

abstract public class QueueClass {
    protected List<Patient> listOfPatients;

    public QueueClass(){
        listOfPatients = new ArrayList<>();
    }
    public void queuePatientUp(Patient patient){
        listOfPatients.add(patient);
    }
    public abstract Patient getNextPatient();


}
