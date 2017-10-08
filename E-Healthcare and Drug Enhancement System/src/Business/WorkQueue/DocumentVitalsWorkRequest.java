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
 * @author vivekshetye
 */
public class DocumentVitalsWorkRequest extends WorkRequest {
    
    private Patient patient;
    private PatientVisit patientVisit;
    
    public DocumentVitalsWorkRequest() {
        super();
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
    
    @Override
    public String toString() {
        return this.getSender().getPerson().getName();
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
    
}
