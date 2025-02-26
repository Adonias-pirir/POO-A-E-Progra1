/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlnotasuncurso;

/**
 *
 * @author Dell Latitude
 */
public class ControlNotasUnCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Curso curso1 = new Curso("23-04", "Programacion1", "Miguel");
        
        Estudiante estudiante1 = new Estudiante("Josue", "1423-25", 70);
        estudiante1.asignar(curso1);
        
        Estudiante estudiante2 = new Estudiante("Adonias", "1993-25", 61);
        estudiante2.asignar(curso1);
        
        Estudiante estudiante3 = new Estudiante("Carlos", "9884-25", 25);
        estudiante3.asignar(curso1);
        
        curso1.mostrarEstudiantesAsignados();
        
        System.out.println("El promedio es: "+ curso1.calcularPromedio());
        
        curso1.mostrarEstudiantesAprobados();
    }
    
}
