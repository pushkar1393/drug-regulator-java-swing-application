/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Drug.DrugDirectory;
import Business.Drug.MasterCompoundCatalog;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class DrugManufacturingEnterprise extends Enterprise {

    private DrugDirectory drugDirectory;
    private MasterCompoundCatalog masterCompoundCatalog;

    public DrugManufacturingEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.DrugManufacturing);
        masterCompoundCatalog = new MasterCompoundCatalog();
        drugDirectory = new DrugDirectory();

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    /**
     * @return the drugDirectory
     */
    public DrugDirectory getDrugDirectory() {
        return drugDirectory;
    }

    /**
     * @param drugDirectory the drugDirectory to set
     */
    public void setDrugDirectory(DrugDirectory drugDirectory) {
        this.drugDirectory = drugDirectory;
    }

    /**
     * @return the masterCompoundCatalog
     */
    public MasterCompoundCatalog getMasterCompoundCatalog() {
        return masterCompoundCatalog;
    }

    /**
     * @param masterCompoundCatalog the masterCompoundCatalog to set
     */
    public void setMasterCompoundCatalog(MasterCompoundCatalog masterCompoundCatalog) {
        this.masterCompoundCatalog = masterCompoundCatalog;
    }

}
