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
public class ReporteCategory extends Reporte{
    
    public ReporteCategory(CuentaBanco cuenta){
        cuentaB = cuenta; 
        setSortable(new SortCategory());
    }
    
}
