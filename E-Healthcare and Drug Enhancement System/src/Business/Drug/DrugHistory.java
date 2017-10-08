/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class DrugHistory {
    
    private ArrayList<DrugVersions> drugVersions;
    
    public DrugHistory(){
        drugVersions = new ArrayList<DrugVersions>();
    }

    /**
     * @return the drugVersions
     */
    public ArrayList<DrugVersions> getDrugVersions() {
        return drugVersions;
    }

    /**
     * @param drugVersions the drugVersions to set
     */
    public void setDrugVersions(ArrayList<DrugVersions> drugVersions) {
        this.drugVersions = drugVersions;
    }
    
    public DrugVersions addDrugVersions(String sideEffects, String benefits, String formula){
        DrugVersions d = new DrugVersions();
        d.setSideEffects(sideEffects);
        d.setFormula(formula);
        d.setBenefits(benefits);
        drugVersions.add(d);
        return d;
    }
}
