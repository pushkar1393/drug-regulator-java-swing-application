/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class DiseaseDirectory {
 
    private ArrayList<Disease> diseaseList;
    
    public DiseaseDirectory(){
        diseaseList = new ArrayList<>();
    }

    /**
     * @return the diseaseList
     */
    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }

    /**
     * @param diseaseList the diseaseList to set
     */
    public void setDiseaseList(ArrayList<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }

    public Disease addDisease(String name, String gene, String severity, Disease.category category, boolean b) {
      Disease disease = new Disease();
      disease.setName(name);
      disease.setGene(gene);
      disease.setSeverity(severity);
      disease.setCategory(category);
      disease.setDrugAvailable(b);
      diseaseList.add(disease);
      return disease;
    }
}
