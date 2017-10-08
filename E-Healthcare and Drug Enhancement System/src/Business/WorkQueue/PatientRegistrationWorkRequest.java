/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;

/**
 *
 * @author vivekshetye
 */
public class PatientRegistrationWorkRequest extends WorkRequest {
    
    private String Message;
    
    
    public PatientRegistrationWorkRequest() {
        super();
      
    }

    

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    @Override
    public String toString(){
        return this.getSender().getPerson().getName();
    }
    
    
}
