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
public abstract class Catalogo {
    
    final void update(int valor){
        leerDatos();
        if(ValidarDatos(valor)){
            guardar(valor);
        } else{
            error();
        }
            
    }
    public abstract boolean ValidarDatos(int edad);
    
    public abstract void guardar(int valor);
    
    public abstract void leerDatos();
    
    public void error(){
        System.out.println("Hubo un error :(");
    }
    
}
