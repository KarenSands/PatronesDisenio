/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

/**
 *
 * @author karen
 */
public class StrategyController {
    
    public static void main(String[] args) {
        
        CuentaBanco c1 = new CuentaBanco();
        Transaccion t1 = new Transaccion("02/02/2019", "Liverpool", 599, "Ropa");
        Transaccion t2 = new Transaccion("02/02/2018", "Walmart", 235, "Comida");
        Reporte r1 = new ReporteQty(c1);
        c1.setTransacciones(t1);
        c1.setTransacciones(t2);
        
        System.out.println("Lista de transacciones: ");
        r1.desplegarTransaccion();
        
        System.out.println("Sort por Fecha");
        r1.setSortable(new SortFecha());
        r1.performSort(c1.getTransacciones());
        
        System.out.println("Sort por Comercio");
        r1.setSortable(new SortComercio());
        r1.performSort(c1.getTransacciones());
        
        System.out.println("Sort por Cantidad");
        r1.setSortable(new SortQty());
        r1.performSort(c1.getTransacciones());
        
        System.out.println("Sort por Categoría");
        r1.setSortable(new SortCategory());
        r1.performSort(c1.getTransacciones());
        
    }
    
}
