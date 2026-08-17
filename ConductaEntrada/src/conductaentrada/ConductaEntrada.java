/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conductaentrada;

import java.util.Scanner;
import modelos.Cuenta;
import modelos.Ahorro;
import modelos.Corriente;
import service.ServiceCuenta;

/**
 *
 * @author Ricardo J
 */
public class ConductaEntrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ServiceCuenta serviceCuenta = new ServiceCuenta();
        
        int opcion;
        
        do{
            System.out.println("\n-----SISTEMA DE CUENTAS-----");
            System.out.println("1. Crear cuenta de Ahorro");
            System.out.println("2. Crear cuenta Corriente");
            System.out.println("3. Listar cuentas de Ahorro");
            System.out.println("4. Listar cuentas Corrientes");
            System.out.println("5. Buscar cuenta por numero");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion){
                
                case 1:
                    crearAhorro(scanner, serviceCuenta);
                    break;
                    
                case 2:
                    crearCorriente(scanner, serviceCuenta);
                    break;
                    
                case 3:
                    listarAhorro(serviceCuenta);
                    break;
                    
                case 4:
                    listarCorriente(serviceCuenta);
                    break;
                    
                case 5:
                    buscarCuenta(scanner, serviceCuenta);
                    break;
                    
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    
            }

        } while (opcion != 0);
    }
    
    public static void crearAhorro(Scanner scanner, ServiceCuenta serviceCuenta){
        
        System.out.println("\n--- CREAR CUENTA DE AHORROS ---");
        
        System.out.print("Numero de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        
        
        System.out.print("Numero de DNI: ");
        long dniCliente = scanner.nextLong();
        
        
        System.out.print("Saldo actual: ");
        double saldoActual = scanner.nextDouble();
        scanner.nextLine();
        
        
        System.out.print("Fecha de creacion: ");
        String fechaCreacion = scanner.nextLine();
        
        Ahorro ahorro = new Ahorro(
                numeroCuenta,
                dniCliente,
                saldoActual,
                fechaCreacion
        );
        
        serviceCuenta.crearCuenta(ahorro);
        
        System.out.println("\nCuenta de ahorro creada correctamente.");
        
    }
    
    public static void crearCorriente(Scanner scanner, ServiceCuenta serviceCuenta) {

       System.out.println("\n--- CREAR CUENTA CORRIENTE ---");

       System.out.print("Numero de cuenta: ");
       String numeroCuenta = scanner.nextLine();

       System.out.print("DNI del cliente: ");
       long dniCliente = scanner.nextLong();

       System.out.print("Saldo actual: ");
       double saldoActual = scanner.nextDouble();

       System.out.print("Impuesto: ");
       double impuesto = scanner.nextDouble();
       scanner.nextLine();

       Corriente corriente = new Corriente(
               numeroCuenta,
               dniCliente,
               saldoActual,
               impuesto
       );

       serviceCuenta.crearCuenta(corriente);

       System.out.println("\nCuenta corriente creada correctamente.");
    }

    public static void listarAhorro(ServiceCuenta serviceCuenta) {

        System.out.println("\n--- CUENTAS DE AHORRO ---");

        boolean hayCuentas = false;

        for (Cuenta cuenta : serviceCuenta.ListarCuenta()) {

            if (cuenta instanceof Ahorro) {
                System.out.println(cuenta);
                hayCuentas = true;
            }
        }

        if (!hayCuentas) {
            System.out.println("\nNo hay cuentas de ahorro registradas.");
        }
    }

    public static void listarCorriente(ServiceCuenta serviceCuenta) {

        System.out.println("\n--- CUENTAS CORRIENTES ---");

        boolean hayCuentas = false;

        for (Cuenta cuenta : serviceCuenta.ListarCuenta()) {

            if (cuenta instanceof Corriente) {
                System.out.println(cuenta);
                hayCuentas = true;
            }
        }

        if (!hayCuentas) {
            System.out.println("\nNo hay cuentas corrientes registradas.");
        }
    }

    public static void buscarCuenta(Scanner scanner, ServiceCuenta serviceCuenta) {

        System.out.println("\n--- BUSCAR CUENTA ---");

        System.out.print("Ingrese el numero de cuenta: ");
        String numeroCuenta = scanner.nextLine();

        Cuenta cuenta = serviceCuenta.obtenerCuenta(numeroCuenta);

        if (cuenta != null) {
            System.out.println("\nCuenta encontrada:");
            System.out.println(cuenta);
        } else {
            System.out.println("\nNo se encontro una cuenta con ese numero.");
        }
    }
}

