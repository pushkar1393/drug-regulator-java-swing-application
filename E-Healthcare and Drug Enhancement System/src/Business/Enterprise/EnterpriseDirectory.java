/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    //Create Enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Patient, type);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.DrugManufacturing) {
            enterprise = new DrugManufacturingEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.FDA) {
            if (checkIfSingleFDA()) {
                enterprise = new FDAEnterprise(name);
                enterpriseList.add(enterprise);
            }
        }
        return enterprise;
    }

    //check if single FDA enterprise exists
    private boolean checkIfSingleFDA() {
        int count = 0;
        boolean flag = false;
        for (Enterprise inEnterprise : enterpriseList) {
            if (inEnterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.FDA)) {
                count++;
            }
        }
        if (count == 0) {
            flag = true;
        }

        return flag;
    }

}
