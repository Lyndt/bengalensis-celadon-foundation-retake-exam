package com.hospitalsimulator;

import java.util.Queue;

public class Hospital {
    //TODO: queue (https://www.geeksforgeeks.org/queue-interface-java/)
    private Queue patientQueue;

    public Hospital(Queue patientQueue) {
        this.patientQueue = patientQueue;
    }


    public void addPatient(Patient patient) {
        patientQueue.add(patient);
    }

    public void treatNextPatient() throws Exception {
        Patient patientNextToTreat = patientQueue.getNextPatient();
        if (patientNextToTreat != null) {
            patientNextToTreat.treat();
        }
    }
    public Queue getPatientQueue(){
        return patientQueue;
    }

}
