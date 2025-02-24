/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioncuentasbancarias;

/**
 *
 * @author Dell Latitude
 */
public class GestionCuentasBancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBancaria cuenta = new CuentaBancaria(32095476, 700);
        
        System.out.println("La cuenta creada es: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo inicial: " + cuenta.getSaldoInicial());
        
        cuenta.setSaldoInicial(500);
        System.out.println("La cuenta creada es: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo inicial: " + cuenta.getSaldoInicial());
        
        //retirar
        cuenta.retirar(200);
        
        System.out.println("Saldo disponible: " + cuenta.getSaldoInicial());
        
        cuenta.retirar(400);
        
        //depositar
        cuenta.depositar(400);
    }
     
}
