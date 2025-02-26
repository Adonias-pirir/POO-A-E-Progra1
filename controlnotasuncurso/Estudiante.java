/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlnotasuncurso;

/**
 *
 * @author Dell Latitude
 */
public class Estudiante {
    
    private String nombre;
    private String carnet;
    private int notaFinal;
    private Curso cursoAsignados[] = new Curso[5];
    private int cantidadCursosAsignados;
    
    public Estudiante(String nombre, String carnet, int notaFinal){
        this.nombre = nombre;
        this.carnet = carnet;
        this.notaFinal = notaFinal;
        this.cantidadCursosAsignados = 0;

    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getCarnet(){
        return this.carnet;
    }
    public void setCarnet(String carnet){
        this.carnet = carnet;
    }
    
    public int getNotaFinal(){
        return this.notaFinal;
    }
    public void setNotaFinal(int notaFinal){
        if (notaFinal >= 0 && notaFinal <= 100){
         this.notaFinal = notaFinal;   
        }else{
            System.err.println("Error: La nota esta fuera de rango 0-100");
        }
        
    }
    
    void asignar(Curso curso){
        this.cursoAsignados[cantidadCursosAsignados] = curso;
        cantidadCursosAsignados ++;
        curso.agregarEstudiante(this);
        System.out.println("El estudiante se asigna");
    }
    public String toString(){
          return("Nombre: "+ this.nombre +" Carne: " + this.carnet + " Nota Final: "+ this.notaFinal);
      }
    
    
}
