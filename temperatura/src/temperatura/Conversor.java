/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temperatura;

/**
 *
 * @author info7
 */
public class Conversor {
    
    double celsiusToFahrenheit(double cTemp){
        double fTemp;
        
        fTemp = (9 * cTemp) / 5 + 32;
        
        return fTemp;
    }
      double celsiusToKelvin(double cTemp){
        double kTemp;
        
        kTemp = cTemp + 273.15;
        
        return kTemp;
    }
      double FahrenheitToCelsius(double fTemp){
        double cTemp;
        
        cTemp = (fTemp-32) * 5/9;
        
        return cTemp;
    }
    double FahrenheitToKelvin(double fTemp){
        double kTemp;
        
        kTemp = (fTemp-32) * 5/9 + 273.15;
        
        return kTemp;
    }
    double KelvinToCelsius(double kTemp){
        double cTemp;
        
        cTemp = kTemp-273.15;
        
        return cTemp;
    }
    double KelvinToFahrenheit(double kTemp){
        double fTemp;
        
        fTemp = (kTemp-273.15) * 9/5 + 32;
        
        return fTemp;
    }
}
