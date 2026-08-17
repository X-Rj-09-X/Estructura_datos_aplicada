/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;
import java.util.List;
import modelos.Cuenta;

/**
 *
 * @author Ricardo J
 */
public interface IServiceCuenta {
    
    List<Cuenta> ListarCuenta();
    Cuenta obtenerCuenta(String numeroCuenta);
    void crearCuenta(Cuenta cuenta);
    
}
