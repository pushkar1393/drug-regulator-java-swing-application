/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Disease.Disease;
import Business.Disease.DiseaseDirectory;
import Business.EcoSystem;
import Business.Enterprise.DrugManufacturingEnterprise;
import Business.Enterprise.Enterprise;
import Business.DrugManufacturing.Organization.MassProductionOrganization;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.MassProductionRole.MassProductionWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author Pushkar
 */
public class MassProductionRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, DiseaseDirectory diseaseDirectory,Network network) {
        return new MassProductionWorkAreaJPanel(userProcessContainer, account, (MassProductionOrganization)organization, (DrugManufacturingEnterprise) enterprise);
    }
}
