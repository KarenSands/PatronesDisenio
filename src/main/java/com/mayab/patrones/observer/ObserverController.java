/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.observer;

/**
 *
 * @author karen
 */
public class ObserverController {
    public static void main(String[] args) {
        
        Vuelo v1 = new Vuelo("10", "Los Angeles", "México", "a tiempo");
        Pasajero p1 = new Pasajero("Karen",v1);
        Pasajero p2 = new Pasajero("Elena",v1);
        v1.addObserverToList(p1);
        v1.addObserverToList(p2);
        v1.deleteObserverFromList(p2);
        p1.alertar(v1);
        v1.setDestino("Miami");
        v1.setEstado("demorado");
        v1.setSala("34");
        p1.alertar(v1);
        
    }
}
