
package com.mycompany.temp;



public class TemperaturaConversor {

    private float CelsiusToFah;
    
       public TemperaturaConversor(float CelsiusToFah){                
                         
        CelsiusToFah = (9 * CelsiusToFah + 160)/5;
       }        

    TemperaturaConversor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
public float getTemp() {
    return CelsiusToFah;
    
   }

    float geTemp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
