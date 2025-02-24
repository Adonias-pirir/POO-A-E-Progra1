/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncuentasbancarias;

/**
 *
 * @author Dell Latitude
 */
public class CuentaBancaria {
    
    private int numeroCuenta;
    private double saldoInicial;
    
    public CuentaBancaria(int numeroCuenta, double saldoInicial){
        this.numeroCuenta = numeroCuenta;
        this.saldoInicial = saldoInicial;
    }
    
    public void depositar(double cantidad){
        if (cantidad > 0){
            saldoInicial += cantidad;
            System.out.println("Deposito de: " + cantidad + "exitoso");
            System.out.println("Saldo total disponible: " + saldoInicial);
        }else{
            System.err.println("La cantidad debe ser positiva");
        }
        
    }
    
    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldoInicial ){
            saldoInicial -= cantidad;
            System.out.println("Retiro de: " + cantidad + " exitoso");
        }else{
            System.err.println("Retiro de: " + cantidad + " invalido");
            System.err.println("Saldo insuficiente");
        }
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
        
}
