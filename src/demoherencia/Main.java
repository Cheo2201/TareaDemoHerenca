/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;
import java.util.Scanner;

/**
 *
 * @author Privado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner run = new Scanner(System.in);
        
    System.out.println("¿Que cuenta desea que se abra?");
    System.out.println("1 = CuentaDeBanco");
    System.out.println("2 = CuentaDeAhorro");
    System.out.println("3 = CuentaDeCheques");
            int cuenta = run.nextInt();
        
        if (cuenta == 1){    
    System.out.println("Ingrese el numero de la cuenta.");
        int numeroDeCuenta = run.nextInt();
    System.out.println("Ingrese el nombre del cliente.");
        String nombre = run.next();
    System.out.println("Ingrese el apellido del cliente");
        String apellido = run.next();
        Cliente cliente = new Cliente (nombre,apellido);
        CuentaDeBanco cuentaDeBanco = new CuentaDeBanco(numeroDeCuenta,cliente);
        
        int contador = 0;
        
        while (contador == 0){
    System.out.println("¿Que accion desea realizar?");
    System.out.println("1 = Introduzca datos personales");
    System.out.println("2 = Escribia los datos del cliente");
    System.out.println("3 = Depositar");
    System.out.println("4 = Retirar");
    System.out.println("5 = Finalizar");
         
      //acciones//
            
        int accion = run.nextInt();
        
        if (accion == 1){
            
    System.out.println("Ingrese su fecha de nacimiento del cliente.");
        String fechaDeNacimiento; 
               fechaDeNacimiento = run.nextLine();
        String fecheDeNacimiento = run.nextLine();
                
    System.out.println("Ingrese la direccion del cliente.");
        String direccion = run.nextLine();
               
    System.out.println("Ingrese su ocupacion del cliente.");
        String ocupacion= run.nextLine();
                
    System.out.println("Ingrese el numero telefonico del cliente.");
        String telefono= run.nextLine();
                
    System.out.println("Ingrese el correo del cliente.");
        String correo = run.nextLine();
             
            cliente.setfechaDeNacimiento(fechaDeNacimiento);
            cliente.setdireccion(direccion);
            cliente.setocupacion(ocupacion);
            cliente.settelefono(telefono);
            cliente.setcorreo(correo);
            }
        
            if (accion == 2){
                
    System.out.println("El numero de la cuenta es: " 
            +cuentaDeBanco.getnumeroDeCuenta());
    
    System.out.println("El nombre del cliente es: " 
            +cliente.getnombre());
    
    System.out.println("El apellido del cliente es: " 
            +cliente.getapellido());
    
    System.out.println("La fecha de nacimiento del cliente es: "
            +cliente.getfechaDeNacimiento());
    
    System.out.println("El cliente habita en: " 
            +cliente.getdireccion());
    
    System.out.println("el cliente trabaja como: " 
            +cliente.getocupacion());
    
    System.out.println("El numero telefonico del cliente es: "
            +cliente.gettelefono());
    
    System.out.println("El correo electronico es: "
            +cliente.getcorreo());
            }
           
            if (accion == 3){
                
    System.out.println("¿Que monto desea depositar?");
            double cantidad = run.nextDouble();
                cuentaDeBanco.Depositar(cantidad);
            }
            
            if (accion == 4){
                
    System.out.println("¿Que monto desea retirar?");
            double cantidad = run.nextDouble();
                cuentaDeBanco.Retirar(cantidad);
            }
            
            if (accion == 5){
                
    System.out.println("Fin, hasta la proxima");
                contador = 0;
            }
            
            double saldo = cuentaDeBanco.getSaldo();
                   System.out.println(+saldo);
            }
        }
        else {
            System.out.println("La cuenta no se encuentra disponible por el momento.");
                }
}
    }
    

