package com.hospitalsimulator;

public class SafeQueue extends QueueClass {

    @Override
    public Patient getNextPatient() {
        if (listOfPatients.isEmpty()) {
            return null;
        }
        int maximumSeverity = 0;
        int indexOfSeverity = -1;
        for (int i = 0; i < listOfPatients.size(); i++) {
            int currentSeverity = listOfPatients.get(i).getPatientSeverity();
            if (maximumSeverity < currentSeverity) {
                maximumSeverity = currentSeverity;
                indexOfSeverity = i;
            }
        }
        if (indexOfSeverity == -1) {
            return null;
        }
        return listOfPatients.get(indexOfSeverity);
    }
}
