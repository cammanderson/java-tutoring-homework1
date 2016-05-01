/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author java
 */
public class Length {
    
    private double measurement;
    private MeasurementUnit unit;
        
    // Constructors
    public Length() {
        this(0, MeasurementUnit.MILLIMETRE);
    }
    
    public Length(MeasurementUnit unit) {
        this(0, unit);
    }
    
    public Length(double measurement, MeasurementUnit unit) {
        this.measurement = measurement;
        this.unit = unit;
    }
    
    // Basic arithmetic supported by this class
    public void add(Length... lengths) {
        for(Length length: lengths) {
            measurement += (length.getMillimeters() / unit.getMillimeters());
        }
    }
    
    // Accessors
    public double getMeasurement() {
        return measurement;
    }
    
    public MeasurementUnit getUnit() { 
        return unit;
    }
    
    public double getMillimeters() {
        return measurement * unit.getMillimeters();
    }
    
    // Representations
    
    public double as(MeasurementUnit unit) {
        return getMillimeters() / unit.getMillimeters();
    }
    
    public String toString() {
        return String.format(
                "Length measurement: %s, unit: %s\n"
                        + "- Converted: %skm, %sm, %smm, "
                        + "%s yards, %s miles", 
                getMeasurement(),
                getUnit().name(),
                getMillimeters(),
                as(MeasurementUnit.KILOMETER),
                as(MeasurementUnit.METRE),
                as(MeasurementUnit.MILLIMETRE),
                as(MeasurementUnit.YARD),
                as(MeasurementUnit.MILE) 
        );
    }
    
}
