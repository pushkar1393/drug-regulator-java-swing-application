/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import java.util.ArrayList;

/**
 *
 * @author Pushkar
 */
public class MasterCompoundCatalog {
    
    private ArrayList<Compound> compoundList;
    
    public MasterCompoundCatalog(){
        compoundList = new ArrayList<>();
    }

    /**
     * @return the compoundList
     */
    public ArrayList<Compound> getCompoundList() {
        return compoundList;
    }

    /**
     * @param compoundList the compoundList to set
     */
    public void setCompoundList(ArrayList<Compound> compoundList) {
        this.compoundList = compoundList;
    }
    
    public Compound addCompound(){
        Compound compound = new Compound();
        
        return compound;
    }
       
     public boolean checkDuplicateCompoundEntry(String name, String formula) {
        boolean flag = false;
        for(Compound compound : compoundList)
        {
                 if(compound.getCompoundName().equalsIgnoreCase(name) || compound.getMolecularFormula().equalsIgnoreCase(formula))  {
                     flag = true;
                     break;
                 }
        }  
        return flag;
    }

    public void deleteCompound(Compound compound) {
        compoundList.remove(compound);
    }
    
}
