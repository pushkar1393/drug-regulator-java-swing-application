/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import Business.Patient.PatientVisit;

/**
 *
 * @author Pushkar
 */
public class DiseaseEvaluationWorkRequest extends WorkRequest {

    private Patient patient;
    private PatientVisit patientVisit;

    public DiseaseEvaluationWorkRequest() {
        super();
    }

    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * @return the patientVisit
     */
    public PatientVisit getPatientVisit() {
        return patientVisit;
    }

    /**
     * @param patientVisit the patientVisit to set
     */
    public void setPatientVisit(PatientVisit patientVisit) {
        this.patientVisit = patientVisit;
    }
    
    @Override
    public String toString() {
        return this.getPatient().getName();
    }
}
