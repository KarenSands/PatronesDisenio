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
public class Producto extends Catalogo{
    public String codigoBarras;
    public int precio;

    public Producto(String codigoBarras, int precio) {
        this.codigoBarras = codigoBarras;
        this.precio = precio;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
    public boolean ValidarDatos(int precio) {
        boolean aceptado=false; 
        aceptado = precio >= 10;
        return aceptado;   
    }
    
    @Override
    public void guardar(int valor) {
        this.precio= valor;
    }

    @Override
    public void leerDatos() {
        System.out.println("Precio "+this.precio +", Código: " + this.codigoBarras);
    }
        
    
}
