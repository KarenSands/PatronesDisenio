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
public class SortFecha implements Sortable{
    
    @Override
    public void sort(ArrayList transaccion) {
        System.out.println("Se está ordenando por fecha... ");
    }
}
