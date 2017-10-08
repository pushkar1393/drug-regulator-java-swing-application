/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Employee.Employee;
import Business.Hospital.Organization.PatientOrganization;
import Business.Organization.Organization;
import Business.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author Pushkar
 */
public class PersonDirectory {

    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    /**
     * @return the personList
     */
    public ArrayList<Person> getPersonList() {
        return personList;
    }

    /**
     * @param personList the personList to set
     */
    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

//      public Person createPerson(String name,Organization org ){
//        Person person=null;
//        if(org instanceof PatientOrganization){
//            person = new Patient(name);
//        }else{
//        person = new Employee(name);
//        }
//        personList.add(person);
//        return person;
//    } 
    public Person createPerson(String name, Organization org) {
        Person person = new Employee(name);
        personList.add(person);
        return person;
    }

    public Person createPatient(String name, int age, Patient.genderType gender, int contactNo, Patient.maritalStatusType status) {

        Person person = new Patient(name, age, gender, contactNo, status);
        personList.add(person);
        return person;
    }
}
