/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

import java.util.ArrayList;

/**
 *
 * @author karen
 */
public abstract class Reporte extends CuentaBanco{
    CuentaBanco cuentaB; 
    Sortable sort;
    
    public void desplegarTransaccion(){
        
        for(Transaccion transaccion : cuentaB.getTransacciones()){
        System.out.println(" Información de transacción--> Fecha:" + transaccion.getFecha() + ", Comercio:" + transaccion.getComercio() + ", Cantidad: " + transaccion.getCantidad() + ", Categoría: " + transaccion.getCategoría());
        }
    }
    
    	public void setSortable(Sortable sort) {
		this.sort = sort;
	}
        
        public void performSort(ArrayList transaccion){
            sort.sort(transaccion);
        }
    
}
