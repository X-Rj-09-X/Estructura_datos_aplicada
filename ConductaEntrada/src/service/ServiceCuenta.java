/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import modelos.Cuenta;

/**
 *
 * @author Ricardo J
 */
public class ServiceCuenta implements IServiceCuenta {
    
    private List<Cuenta> cuentas;
    
    public ServiceCuenta(){
        cuentas = new ArrayList();
    }

    @Override
    public List<Cuenta> ListarCuenta() {
        return cuentas;
    }

    @Override
    public Cuenta obtenerCuenta(String numeroCuenta) {
        for (Cuenta cuenta : cuentas) {
            
            if(cuenta.getNumeroCuenta().equals(numeroCuenta)){
                return cuenta;
            }
        }
        return null;
    }

    @Override
    public void crearCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }
    
    
    
}
