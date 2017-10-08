/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class TrialDirectory {
    
    private ArrayList<Trial> trialDirectory;
    
    public TrialDirectory(){
        trialDirectory = new ArrayList<>();
    }

    /**
     * @return the trialDirectory
     */
    public ArrayList<Trial> getTrialDirectory() {
        return trialDirectory;
    }

    /**
     * @param trialDirectory the trialDirectory to set
     */
    public void setTrialDirectory(ArrayList<Trial> trialDirectory) {
        this.trialDirectory = trialDirectory;
    }
}
