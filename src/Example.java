
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author java
 */
public class Example {
    
    public static void main(String[] args) {
        
        // 1) Example of using Enum and 2) Switch with enum
        MeasurementUnit metre = MeasurementUnit.METRE;
        switch(metre) {
            case METRE:
                System.out.println("Switch has identified the METRE unit");
                break;
        }
        
        // 3) Example of using Generics with collections for addition
        List<Length> measurements = new ArrayList<>(); // Minimal declaration
        measurements.add(new Length(1, MeasurementUnit.CENTIMETRE));
        measurements.add(new Length(3.14, MeasurementUnit.MILE));
        measurements.add(new Length(99, MeasurementUnit.METRE));
        measurements.add(new Length(129, MeasurementUnit.MILLIMETRE));
        
        // Show that generics accept subclasses
        // Note: We would not declare a class here 'usually'..
        class Metre extends Length {
            public Metre(double measurement) {
                super(measurement, MeasurementUnit.METRE);
            }
        }
        measurements.add(new Metre(100)); // Generic accept subclass
        
        // 4) Example of using for loop syntax
        Length totalA = new Length(MeasurementUnit.KILOMETER);
        for(Length measurement: measurements) {
            totalA.add(measurement);
        }
        System.out.println(totalA);
                
        // 5) Example, using Java varargs
        Length totalB = new Length(MeasurementUnit.METRE);
        totalB.add(
                new Length(5, MeasurementUnit.MILE),
                new Length(10, MeasurementUnit.KILOMETER),
                new Length(3, MeasurementUnit.MILE)
        );
        System.out.println(totalB);
        
        // TODO: Functional programming of the above
                
        // Review of collections in Java
                
    }
    
}
