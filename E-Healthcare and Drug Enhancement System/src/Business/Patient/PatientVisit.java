/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Disease.Disease;
import Business.Drug.Drugs;

import Business.Vitals.VitalSigns;
import java.util.Date;

/**
 *
 * @author vivekshetye
 */
public class PatientVisit {
    
    private Date appointmentDate;
    private String symptoms;
    private Disease disease;
    private Drugs drugs;
    private String recoveryPercent;
    private VitalSigns vitalSigns;
    
    
    public PatientVisit() {
    disease = new Disease();
    drugs = new Drugs();
    vitalSigns = new VitalSigns(0, 0, 0, 0);
        
        
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public Drugs getDrugs() {
        return drugs;
    }

    public void setDrugs(Drugs drugs) {
        this.drugs = drugs;
    }

    public String getRecoveryPercent() {
        return recoveryPercent;
    }

    public void setRecoveryPercent(String recoveryPercent) {
        this.recoveryPercent = recoveryPercent;
    }

    /**
     * @return the vitalSigns
     */
    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    /**
     * @param vitalSigns the vitalSigns to set
     */
    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    
    
    
}
