/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registroproductoeninventario;

/**
 *
 * @author Dell Latitude
 */
public class RegistroProductoEnInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto prod1 = new Producto("1234", "Sardina", -10);
        System.out.println("El codigo del producto es: " + prod1.getCodigo() + 
                           "\nnombre: " + prod1.getNombre() + 
                           "\nPrecio: "+ prod1.getPrecio());
        
        prod1.setPrecio(10);
        System.out.println("Precio actualizado: "+ prod1.getPrecio());

    }
}
    
