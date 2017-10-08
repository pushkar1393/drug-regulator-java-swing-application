/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugManufacturing.Organization;

import Business.Drug.Compound;
import Business.Orders.CompoundOrder;
import Business.Organization.Organization;
import Business.Role.DrugManufacturingRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class DrugManufacturingOrganization  extends Organization{
    
    private ArrayList<Compound> procuredCompoundList;
    private ArrayList<CompoundOrder> ordersList;
     public DrugManufacturingOrganization() {
        super(Organization.Type.DrugManufacturing.getValue());
        procuredCompoundList = new ArrayList<>();
        ordersList = new ArrayList<>();
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DrugManufacturingRole());
        return roles;
    }

    /**
     * @return the procuredCompoundList
     */
    public ArrayList<Compound> getProcuredCompoundList() {
        return procuredCompoundList;
    }

    /**
     * @param procuredCompoundList the procuredCompoundList to set
     */
    public void setProcuredCompoundList(ArrayList<Compound> procuredCompoundList) {
        this.procuredCompoundList = procuredCompoundList;
    }

    /**
     * @return the ordersList
     */
    public ArrayList<CompoundOrder> getOrdersList() {
        return ordersList;
    }

    /**
     * @param ordersList the ordersList to set
     */
    public void setOrdersList(ArrayList<CompoundOrder> ordersList) {
        this.ordersList = ordersList;
    }

    
}
