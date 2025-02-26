/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlnotasuncurso;

/**
 *
 * @author Dell Latitude
 */
public class Curso {
    
    private String codigo;
    private String nombre;
    private String catedratico;
    private Estudiante estudiantesAsignados[] = new Estudiante[50];
    private int numeroEstudiantes;

        public Curso(String codigo, String nombre, String catedratico) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.catedratico = catedratico;
            this.numeroEstudiantes = 0;
        }
    
    public void agregarEstudiante (Estudiante estudiante){
        this.estudiantesAsignados[numeroEstudiantes] = estudiante;
        numeroEstudiantes++;
    }
    
    public void mostrarEstudiantesAsignados(){
        for(int i = 0; i < numeroEstudiantes; i++){
            System.out.println(this.estudiantesAsignados[i]);            
        }        
    }
    
    public double calcularPromedio(){
        if (numeroEstudiantes == 0){
            System.out.println("Error: No hay estudiates");
            return 0;
        }
        double sumarNotas = 0;
        for (int i = 0; i < numeroEstudiantes; i++){
            sumarNotas += estudiantesAsignados[i].getNotaFinal();
        }
        return sumarNotas / numeroEstudiantes;
    }
    
    public void mostrarEstudiantesAprobados(){
        System.out.println("\nEstudiantes aprobados:");
        boolean aprobados = false;
        
        for (int i = 0; i < numeroEstudiantes; i++){
            if (estudiantesAsignados[i].getNotaFinal() >= 61){
                //mostrar alumnos aprobados
                System.out.println(estudiantesAsignados[i]);
                aprobados = true;   
            }
        }
        
        if (!aprobados){
            System.out.println("Ningun estudiante aprobo");
        }
    }

}
