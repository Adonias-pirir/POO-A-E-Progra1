/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroproductoeninventario;

/**
 *
 * @author Dell Latitude
 */
public class Producto {
    
    private String codigo;
    private String nombre;
    private double precio;
    
    public Producto (String codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio);
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        if (precio > 0){
        this.precio = precio;
        }else{
            System.err.println("El precio no puede ser negativo");
        }
        
    }

    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
}
