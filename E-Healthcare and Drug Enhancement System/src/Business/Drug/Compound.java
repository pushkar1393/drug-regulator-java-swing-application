/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

/**
 *
 * @author Mihir
 */
public class Compound {
    
    private static int counter = 0;
    private int id;
    private String compoundName;
    private String molecularFormula;
    private int quantity;

    public Compound() {
        counter++;
        id = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }        
    
    /**
     * @return the compoundName
     */
    public String getCompoundName() {
        return compoundName;
    }

    /**
     * @param compoundName the compoundName to set
     */
    public void setCompoundName(String compoundName) {
        this.compoundName = compoundName;
    }

    /**
     * @return the molecularFormula
     */
    public String getMolecularFormula() {
        return molecularFormula;
    }

    /**
     * @param molecularFormula the molecularFormula to set
     */
    public void setMolecularFormula(String molecularFormula) {
        this.molecularFormula = molecularFormula;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
        return compoundName;
    }

  
}
