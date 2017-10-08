/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital.Organization;

import Business.Organization.Organization;
import Business.Role.LocalPharmacyRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class LocalPharmacyOrganization extends Organization {
      public LocalPharmacyOrganization() {
        super(Organization.Type.LocalPharmacy.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LocalPharmacyRole());
        return roles;
    }
}
