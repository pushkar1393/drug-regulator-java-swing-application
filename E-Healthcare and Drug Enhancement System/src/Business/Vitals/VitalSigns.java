/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vitals;

/**
 *
 * @author Pushkar
 */
public class VitalSigns {
    private double bodyTemperature;
    private double pulseRate;
    private double bloodPressure;
    private double respirationRate;
    
    public VitalSigns(double bodyTemperature, double pulseRate, double bloodPressure,double respirationRate) {
        this.bodyTemperature = bodyTemperature;
        this.pulseRate = pulseRate;
        this.bloodPressure = bloodPressure;
        this.respirationRate = respirationRate;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public double getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(double pulseRate) {
        this.pulseRate = pulseRate;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(double respirationRate) {
        this.respirationRate = respirationRate;
    }
    
    
}
