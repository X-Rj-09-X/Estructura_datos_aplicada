/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ricardo J
 */
public class Corriente extends Cuenta{
    
    private double impuesto;

    
    
    public Corriente() {
    }


    public Corriente(String numeroCuenta, long dniCliente, double saldoActual, double impuesto) {
        super(numeroCuenta, dniCliente, saldoActual);
        this.impuesto = impuesto;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    @Override
    public String toString() {
        return "Corriente{"
                + "numeroCuenta=" + getNumeroCuenta()
                + ", dniCliente=" + getDniCliente()
                + ", saldoActual=" + getSaldoActual()
                + ", impuesto=" + impuesto
                + '}';
    }
    
    
    
    
    
    
}
