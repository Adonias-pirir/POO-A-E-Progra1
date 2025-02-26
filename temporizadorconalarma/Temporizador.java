 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temporizadorconalarma;

/**
 *
 * @author Dell Latitude
 */
public class Temporizador {
    
    private int tiempoActual;
    private Alarma alarma;
    
    public Temporizador(){
        this.tiempoActual = 0;
    }
    
    public void setAlarma(Alarma alarma){
        this.alarma = alarma;
    }
    
    public int getTiempoActual(){
         return tiempoActual;
    }
    
    public void iniciar (int duracion){
        System.out.println("INICIADO");
        for(int i = 0; i <= duracion; i++){
            tiempoActual = i;
            System.out.println("El tiempo acutal es: "+ tiempoActual + " segundos");
            
        if (alarma != null && tiempoActual == alarma.getTiempoObjetivo()){
            alarma.activarAlarma();
        }
        
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println("El temporizador se ha interrumpido");
        }

      }
    }   
    
}
