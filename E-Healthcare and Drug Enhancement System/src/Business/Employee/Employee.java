/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Person.Person;

/**
 *
 * @author raunak
 */
public class Employee extends Person {

    private int id;
    private static int count = 1;

    public Employee(String name) {
        super(name);
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.getName();
    }

}
