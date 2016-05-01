/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author java
 */
public enum MeasurementUnit {
    MILLIMETRE(1.0), CENTIMETRE(10.0), METRE(100.0), KILOMETER(1000000.0), YARD(914.4), MILE(1609344.0);
    
    private Number millimeters;
    
    MeasurementUnit(Number millimeters) {
        this.millimeters = millimeters;
    }
    
    public double getMillimeters() {
        return this.millimeters.doubleValue();
    }
}
