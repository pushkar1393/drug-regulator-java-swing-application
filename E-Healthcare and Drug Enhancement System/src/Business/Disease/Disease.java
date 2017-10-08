/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

/**
 *
 * @author Mihir
 */
public class Disease {
    
    private String name;
    private String severity;
    private String gene;
    private boolean drugAvailable;
    private category category;

    /**
     * @return the category
     */
    public category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(category category) {
        this.category = category;
    }

  
    
      public enum category {
    A,
    B,
    C,
    D;    
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the severity
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * @param severity the severity to set
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * @return the gene
     */
    public String getGene() {
        return gene;
    }

    /**
     * @param gene the gene to set
     */
    public void setGene(String gene) {
        this.gene = gene;
    }

    /**
     * @return the drugAvailable
     */
    public boolean isDrugAvailable() {
        return drugAvailable;
    }

    /**
     * @param drugAvailable the drugAvailable to set
     */
    public void setDrugAvailable(boolean drugAvailable) {
        this.drugAvailable = drugAvailable;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
