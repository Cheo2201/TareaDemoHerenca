/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;

/**
 *
 * @author Privado
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String ocupacion;
    private String telefono;
    private String correo;
    
    
    Cliente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = "00,00,00";
        this.direccion = "0";
        this.ocupacion = "0";
        this.telefono = "0";
        this.correo = "0";
        
        
    }
    
    public String getnombre(){
        return nombre;
    }
    public String getapellido(){
        return apellido;
    }
    public String getfechaDeNaciemiento(){
        return fechaDeNacimiento;
    }
    public String getdireccion(){
        return direccion;
    }
    public String getocupacion(){
        return ocupacion;
    }
    public String gettelefono(){
        return telefono;
    }
    public String getcorreo(){
        return correo;
    }
    
    //////////////////////////////////////
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public void setapellido(String apellido){
        this.apellido = apellido;
    }
    public void setfechaDeNacimiento(String fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void setdireccion(String direccion){
        this.direccion = direccion;
    }
    public void setocupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
    public void settelefono(String telefono){
        this.telefono = telefono;
    }
    public void setcorreo(String correo){
        this.correo = correo;
    }

    String getfechaDeNacimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
