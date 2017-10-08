/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Disease.DiseaseDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"), Doctor("Doctor"), Nurse("Nurse"), Receptionist("Receptionist"), CompoundSupplier("CompoundSupplier"), DrugManufacturing("DrugManufacturing"), DrugTrial("DrugTrial"), MassProduction("MassProduction");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business, DiseaseDirectory diseaseDirectory, Network network);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
