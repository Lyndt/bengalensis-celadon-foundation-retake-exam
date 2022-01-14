package com.hospitalsimulator;

public class ClassicQueue extends Queue {
    private int currentNumber = 0;

    @Override
    public Patient getNextPatient() {
        if (listOfPatients.isEmpty()) {
            return null;
        }
        if (currentNumber == listOfPatients.size()) {
            currentNumber = 0;
        }
        Patient actualPatient = listOfPatients.get(currentNumber);

        while (actualPatient.getPatientSeverity() == 0 && listOfPatients.size() >= currentNumber) {
            actualPatient = listOfPatients.remove(currentNumber);
        }
        if (listOfPatients.size() == currentNumber) {
            currentNumber--;
        }
        return listOfPatients.get(currentNumber++);
    }
}
