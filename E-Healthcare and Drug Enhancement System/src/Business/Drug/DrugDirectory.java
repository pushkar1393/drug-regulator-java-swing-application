/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import Business.Disease.Disease;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class DrugDirectory {

    private ArrayList<Drugs> drugList;

    public DrugDirectory() {
        drugList = new ArrayList<Drugs>();
    }

    /**
     * @return the drugList
     */
    public ArrayList<Drugs> getDrugList() {
        return drugList;
    }

    /**
     * @param drugList the drugList to set
     */
    public void setDrugList(ArrayList<Drugs> drugList) {
        this.drugList = drugList;
    }

    public Drugs createDrug(String name, String description, String uses, Drugs.routeType type, String formula, Disease disease, String manufactuer) {
        Drugs drug = new Drugs();
        drug.setName(name);
        drug.setDescription(description);
        drug.setUses(uses);
        drug.setType(type);
        drug.setFormula(formula);
        drug.setDisease(disease.getName());
        drug.setManufacturer(manufactuer);
        drugList.add(drug);
        return drug;

    }

}
