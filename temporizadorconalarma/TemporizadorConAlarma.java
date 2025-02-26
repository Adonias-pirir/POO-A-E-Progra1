/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temporizadorconalarma;
/**
 *
 * @author Dell Latitude
 */
public class TemporizadorConAlarma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Temporizador temporizador = new Temporizador ();
        
        Alarma alarma = new Alarma(5);
        
        temporizador.setAlarma(alarma);
        
        temporizador.iniciar(10);
    }
    
}
