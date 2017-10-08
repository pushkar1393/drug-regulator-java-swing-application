/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugManufacturing.Organization;

import Business.Organization.Organization;
import Business.Role.MassProductionRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class MassProductionOrganization extends Organization {
    
     public MassProductionOrganization() {
        super(Organization.Type.MassProduction.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MassProductionRole());
        return roles;
    }
     
}
