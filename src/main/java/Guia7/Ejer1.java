/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

/**
 *
 * @author VMH
 */
public class Ejer1 {
    
    
    /**Datos tarjeta de debito/Credito**/
    
    private String nombre;
    private String fechaVencimiento;
    private String numeroTarjeta;
    private String pinSeguridad;
    
    public Ejer1(String nombre, String fechaVencimiento, String numeroTarjeta, String pinSeguridad)
    {
    this.nombre = nombre;
    this.fechaVencimiento = fechaVencimiento;
    this.numeroTarjeta = numeroTarjeta;
    this.pinSeguridad = pinSeguridad;
    }
    
    public String getNombre(){
    
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
    this.nombre = nombre;
    }
    
    public String getFechavencimiento(){
    
        return fechaVencimiento;
    }
    
    public void setFechaVencimiento(String fechaVencimiento)
    {
    this.fechaVencimiento = fechaVencimiento;
    }
    
    public String getNumeroTarjeta()
    {
    
    return numeroTarjeta;
    }
    
    public void setNumeroTarjeta(String numeroTarjeta)
    {
    this.numeroTarjeta = numeroTarjeta;
    }
    
    public String getPinSeguridad()
    {
    return pinSeguridad;
    }
    
    public void setPinSeguridad(String pinSeguridad)
    {
    this.pinSeguridad = pinSeguridad;
    }
    
}
