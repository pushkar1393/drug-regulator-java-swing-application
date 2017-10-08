/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Disease.Disease;
import Business.Drug.DrugVersions;
import Business.Drug.Drugs;

/**
 *
 * @author Pushkar
 */
public class DrugTrialWorkRequest extends WorkRequest {
    private String result;
    private Drugs drug;
    private DrugVersions drugVersions;
    private Disease disease;

    /**
     * @return the drug
     */
    
    public DrugTrialWorkRequest(){
        super();
    }
    public Drugs getDrug() {
        return drug;
    }

    /**
     * @param drug the drug to set
     */
    public void setDrug(Drugs drug) {
        this.drug = drug;
    }

    /**
     * @return the drugVersions
     */
    public DrugVersions getDrugVersions() {
        return drugVersions;
    }

    /**
     * @param drugVersions the drugVersions to set
     */
    public void setDrugVersions(DrugVersions drugVersions) {
        this.drugVersions = drugVersions;
    }

    /**
     * @return the disease
     */
    public Disease getDisease() {
        return disease;
    }

    /**
     * @param disease the disease to set
     */
    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }
    
}
