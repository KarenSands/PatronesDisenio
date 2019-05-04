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
public class CuentaBanco {
    double saldo;
    ArrayList<Transaccion> transacciones = new ArrayList();

    public CuentaBanco() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Transaccion transacciones) {
        this.transacciones.add(transacciones);
        this.saldo+= transacciones.getCantidad();
    }
    
    
    
}
