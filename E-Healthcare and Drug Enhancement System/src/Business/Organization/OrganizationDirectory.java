/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.DrugManufacturing.Organization.CompoundSupplierOrganization;
import Business.DrugManufacturing.Organization.DrugManufacturingOrganization;
import Business.DrugManufacturing.Organization.DrugTrialOrganization;
import Business.DrugManufacturing.Organization.MassProductionOrganization;
import Business.Enterprise.Enterprise;
import Business.FDA.Organization.DrugEvaluationOrganization;
import Business.Hospital.Organization.DoctorOrganization;
import Business.Hospital.Organization.LocalPharmacyOrganization;
import Business.Hospital.Organization.NurseOrganization;
import Business.Hospital.Organization.PatientOrganization;
import Business.Hospital.Organization.ReceptionistOrganization;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.Type type, Enterprise.EnterpriseType enterpriseType) {
        Organization organization = null;

        if (enterpriseType.getValue().equals(Enterprise.EnterpriseType.Hospital.getValue())) {
            if (type.getValue().equals(Organization.Type.Doctor.getValue())) {
                organization = new DoctorOrganization();
                organizationList.add(organization);
            } else if (type.getValue().equals(Organization.Type.Nurse.getValue())) {
                organization = new NurseOrganization();
                organizationList.add(organization);
            } else if (type.getValue().equals(Organization.Type.Receptionist.getValue())) {
                organization = new ReceptionistOrganization();
                organizationList.add(organization);
            } else if (type.getValue().equals(Organization.Type.LocalPharmacy.getValue())) {
                organization = new LocalPharmacyOrganization();
                organizationList.add(organization);
            } else if (type.getValue().equals(Organization.Type.Patient.getValue())) {
                organization = new PatientOrganization();
                organizationList.add(organization);
            }
        } else if (enterpriseType.getValue().equals(Enterprise.EnterpriseType.DrugManufacturing.getValue())) {
            if (type.getValue().equals(Organization.Type.DrugManufacturing.getValue())) {
                organization = new DrugManufacturingOrganization();
                organizationList.add(organization);
            } else if (type.getValue().equals(Organization.Type.CompoundSupplier.getValue())) {
                organization = new CompoundSupplierOrganization();
                organizationList.add(organization);
            } else if (type.getValue().equals(Organization.Type.DrugTrial.getValue())) {
                organization = new DrugTrialOrganization();
                organizationList.add(organization);
            } else if (type.getValue().equals(Organization.Type.MassProduction.getValue())) {
                organization = new MassProductionOrganization();
                organizationList.add(organization);
            }
        } else if (enterpriseType.getValue().equals(Enterprise.EnterpriseType.FDA.getValue())) {
            if (type.getValue().equals(Organization.Type.DrugEvaluation.getValue())) {
                organization = new DrugEvaluationOrganization();
                organizationList.add(organization);
            }
        }
        return organization;
    }
}
