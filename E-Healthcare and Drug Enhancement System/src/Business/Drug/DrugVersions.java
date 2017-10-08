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
public class DrugVersions {
    
    private int drugNumber;
    static int count=0;
    private String benefits;
    private String sideEffects;
    private String formula;
    private CompoundsUsed compoundsUsed;
    private TrialDirectory trialDirectory;
    private int successRate;
    private boolean approved;
    
    
    public DrugVersions(){
        count++;
        drugNumber= count;
        compoundsUsed = new CompoundsUsed();
        trialDirectory = new TrialDirectory();
    }

    /**
     * @return the drugNumber
     */
    public int getDrugNumber() {
        return drugNumber;
    }

    /**
     * @param drugNumber the drugNumber to set
     */
    public void setDrugNumber(int drugNumber) {
        this.drugNumber = drugNumber;
    }

    /**
     * @return the benefits
     */
    public String getBenefits() {
        return benefits;
    }

    /**
     * @param benefits the benefits to set
     */
    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    /**
     * @return the sideEffects
     */
    public String getSideEffects() {
        return sideEffects;
    }

    /**
     * @param sideEffects the sideEffects to set
     */
    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
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
     * @return the compoundsUsed
     */
    public CompoundsUsed getCompoundsUsed() {
        return compoundsUsed;
    }

    /**
     * @param compoundsUsed the compoundsUsed to set
     */
    public void setCompoundsUsed(CompoundsUsed compoundsUsed) {
        this.compoundsUsed = compoundsUsed;
    }

    /**
     * @return the successRate
     */
    public int getSuccessRate() {
        return successRate;
    }

    /**
     * @param successRate the successRate to set
     */
    public void setSuccessRate(int successRate) {
        this.successRate = successRate;
    }

    /**
     * @return the approved
     */
    public boolean isApproved() {
        return approved;
    }

    /**
     * @param approved the approved to set
     */
    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    /**
     * @return the trialDirectory
     */
    public TrialDirectory getTrialDirectory() {
        return trialDirectory;
    }

    /**
     * @param trialDirectory the trialDirectory to set
     */
    public void setTrialDirectory(TrialDirectory trialDirectory) {
        this.trialDirectory = trialDirectory;
    }
}
