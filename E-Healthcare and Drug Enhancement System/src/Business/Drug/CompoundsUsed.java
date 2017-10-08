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
public class CompoundsUsed {

    private ArrayList<Compound> compoundsUsedList;

    public CompoundsUsed() {
        compoundsUsedList = new ArrayList<Compound>();
    }

    /**
     * @return the compoundsUsedList
     */
    public ArrayList<Compound> getCompoundsUsedList() {
        return compoundsUsedList;
    }

    /**
     * @param compoundsUsedList the compoundsUsedList to set
     */
    public void setCompoundsUsedList(ArrayList<Compound> compoundsUsedList) {
        this.compoundsUsedList = compoundsUsedList;
    }


}
