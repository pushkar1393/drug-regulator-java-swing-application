/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Disease.DiseaseDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FDAEnterprise;
import Business.FDA.Organization.DrugEvaluationOrganization;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DrugEvaluationRole.DrugEvaluationWorkAreaJPanel;

/**
 *
 * @author Pushkar
 */
public class DrugEvaluationRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, DiseaseDirectory diseaseDirectory, Network network) {
      return new DrugEvaluationWorkAreaJPanel(userProcessContainer, account, (DrugEvaluationOrganization)organization, (FDAEnterprise)enterprise,diseaseDirectory,network);
    }
    
}
