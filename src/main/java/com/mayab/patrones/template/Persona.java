/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.template;

/**
 *
 * @author karen
 */
public class Persona extends Catalogo{
    public String Nombre;
    public String Direccion;
    public int Edad; 

    public Persona(String nombre, String direccion, int edad) {
        this.Nombre = nombre;
        this.Direccion = direccion;
        this.Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }
    
    @Override
    public boolean ValidarDatos(int edad) {
       boolean aceptado=false;
       aceptado = edad >= 18;
        return aceptado;
    }

    @Override
    public void guardar(int edad) {
        this.Edad = edad;
    }
    
    @Override
    public void leerDatos() {
        System.out.println("Nombre: "+this.Nombre + ", Dirección: " + this.Direccion +", Edad: " + this.Edad);
    }
    
}
