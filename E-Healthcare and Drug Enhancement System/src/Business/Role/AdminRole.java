/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Disease.DiseaseDirectory;
import Business.EcoSystem;
import Business.Enterprise.DrugManufacturingEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FDAEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DrugManufacturingAdminWorkArea.DrugManufacturingAdminWorkAreaJPanel;
import userinterface.FDAADminWorkArea.FDAAdminWorkAreaJPanel;
import userinterface.HospitalAdminWorkArea.HospitalAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,DiseaseDirectory diseaseDirectory,Network network) {
        
      JPanel panelCreator=null;
      
      if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)){
        panelCreator= new HospitalAdminWorkAreaJPanel(userProcessContainer,(HospitalEnterprise) enterprise);
      } else if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.DrugManufacturing)){
          panelCreator= new DrugManufacturingAdminWorkAreaJPanel(userProcessContainer,(DrugManufacturingEnterprise)enterprise);
      } else {
          panelCreator = new FDAAdminWorkAreaJPanel(userProcessContainer,(FDAEnterprise)enterprise);
      }
      return panelCreator;
    }

    
    
}
