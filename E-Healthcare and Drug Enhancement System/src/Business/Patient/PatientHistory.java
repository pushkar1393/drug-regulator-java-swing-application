/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author vivekshetye
 */
public class PatientHistory {
    
    private ArrayList<PatientVisit> patientHistory;

    public PatientHistory() {
        patientHistory = new ArrayList<>();
    }

    public ArrayList<PatientVisit> getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(ArrayList<PatientVisit> patientHistory) {
        this.patientHistory = patientHistory;
    }
    
    
    
}
