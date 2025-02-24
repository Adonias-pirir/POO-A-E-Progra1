/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controldetemperatura;

/**
 *
 * @author Dell Latitude
 */
public class ControlDeTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Termometro temp = new Termometro(25);
        
        System.out.println("La temperatura es: " + temp.getTemperatura());
        
        temp.conversionFahrenheit();
        temp.conversionKelvin();
        
        temp.setTemperatura(18);
        System.out.println("Nueva temperatura: " + temp.getTemperatura());
        temp.conversionFahrenheit();
        temp.conversionKelvin();
    }
    
}
