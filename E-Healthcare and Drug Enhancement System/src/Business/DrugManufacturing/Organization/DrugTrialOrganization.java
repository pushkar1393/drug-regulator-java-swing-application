/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugManufacturing.Organization;

import Business.Organization.Organization;
import Business.Role.DrugTrialRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class DrugTrialOrganization extends Organization {
    
     public DrugTrialOrganization() {
        super(Organization.Type.DrugTrial.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DrugTrialRole());
        return roles;
    }
     
}
