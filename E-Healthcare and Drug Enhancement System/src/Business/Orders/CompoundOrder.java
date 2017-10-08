/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orders;

import Business.Drug.Compound;
import java.util.ArrayList;

/**
 *
 * @author Pushkar
 */
public class CompoundOrder {
    
    private ArrayList<OrderItems> order;
    
    public CompoundOrder(){
        order= new ArrayList<OrderItems>();
    }

    /**
     * @return the order
     */
    public ArrayList<OrderItems> getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(ArrayList<OrderItems> order) {
        this.order = order;
    }
    
    
    public OrderItems addOrderItems(Compound compound, int quantity ){
        OrderItems o= new OrderItems();
        o.setCompound(compound);
        o.setRequestedQuantity(quantity);
        order.add(o);
        return o;
    }
}
