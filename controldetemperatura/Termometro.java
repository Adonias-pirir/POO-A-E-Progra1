/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controldetemperatura;

/**
 *
 * @author Dell Latitude
 */
public class Termometro {
    
    private double temperatura;
    private double gradosF;
    private double gradosK;
    
    public Termometro(double temperatura){
        this.temperatura = temperatura;
    }
    
    public void conversionFahrenheit(){
        if(temperatura > 0){
            gradosF = (temperatura * 9/5)+32;
            System.out.println(temperatura + " grados Celsius, son: " + gradosF + " grados Fahrenheit");
        }else{
            System.err.println("NO hay grados Celsius");
        }
        
    }
    
    public void conversionKelvin(){
        if (temperatura > 0){
            gradosK = temperatura + 273.15;
            System.out.println(temperatura + " grados Celsius, son: " + gradosK + " grados Kelvin");
        }else{
            System.err.println("No hay grados Celsius");
        }
    }
    
    public double getTemperatura(){
        return temperatura;
    }
    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }
    
    
}
