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
public class Drugs {

    private String number;
    static int count=0;
    private String name;
    private String description;
    private String uses;
    private String manufacturer;
    private routeType type;
    private String formula;
    private String disease;

    /**
     * @return the type
     */
    public routeType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(routeType type) {
        this.type = type;
    }

    /**
     * @return the formula
     */
    public String getFormula() {
        return formula;
    }

    /**
     * @param formula the formula to set
     */
    public void setFormula(String formula) {
        this.formula = formula;
    }

    /**
     * @return the disease
     */
    public String getDisease() {
        return disease;
    }

    /**
     * @param disease the disease to set
     */
    public void setDisease(String disease) {
        this.disease = disease;
    }

    public enum routeType {
        injectional, oral, rectal, vaginal, ocular, otic, nasal, inhalation, nebulization, cutaneous, transdermal;
    }

    private DrugHistory drugHistory;

    public Drugs() {
        count++;
        number= "D"+ count;
        drugHistory = new DrugHistory();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the drugHistory
     */
    public DrugHistory getDrugHistory() {
        return drugHistory;
    }

    /**
     * @param drugHistory the drugHistory to set
     */
    public void setDrugHistory(DrugHistory drugHistory) {
        this.drugHistory = drugHistory;
    }

    /**
     * @return the uses
     */
    public String getUses() {
        return uses;
    }

    /**
     * @param uses the uses to set
     */
    public void setUses(String uses) {
        this.uses = uses;
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    @Override
    public String toString(){
        return name;
    }

}
