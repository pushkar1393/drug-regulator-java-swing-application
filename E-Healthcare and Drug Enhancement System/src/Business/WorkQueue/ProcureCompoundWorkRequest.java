/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Orders.CompoundOrder;

/**
 *
 * @author Mihir
 */
public class ProcureCompoundWorkRequest extends WorkRequest {

    private CompoundOrder compoundOrder;
    private String result;
    
    
    public ProcureCompoundWorkRequest(){
        super();
        compoundOrder= new CompoundOrder();
    }
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return the compoundOrder
     */
    public CompoundOrder getCompoundOrder() {
        return compoundOrder;
    }

    /**
     * @param compoundOrder the compoundOrder to set
     */
    public void setCompoundOrder(CompoundOrder compoundOrder) {
        this.compoundOrder = compoundOrder;
    }
    
    
    @Override
    public String toString() {
       return this.result; 
    }
}
