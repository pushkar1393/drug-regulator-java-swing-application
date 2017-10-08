/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orders;

import Business.Drug.Compound;

/**
 *
 * @author Pushkar
 */
public class OrderItems {
    
    private Compound compound;
    private int requestedQuantity;

    /**
     * @return the compound
     */
    public Compound getCompound() {
        return compound;
    }

    /**
     * @param compound the compound to set
     */
    public void setCompound(Compound compound) {
        this.compound = compound;
    }

    /**
     * @return the requestedQuantity
     */
    public int getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * @param requestedQuantity the requestedQuantity to set
     */
    public void setRequestedQuantity(int requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }
    
    public String toString(){
        return compound.getCompoundName();
    }
}
