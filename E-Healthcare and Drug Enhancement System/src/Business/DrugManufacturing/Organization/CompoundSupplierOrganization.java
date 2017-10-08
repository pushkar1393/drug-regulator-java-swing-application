/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugManufacturing.Organization;

import Business.Organization.Organization;
import Business.Role.CompoundSupplierRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class CompoundSupplierOrganization extends Organization{
    
     public CompoundSupplierOrganization() {
        super(Organization.Type.CompoundSupplier.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CompoundSupplierRole());
        return roles;
    }
     
}
