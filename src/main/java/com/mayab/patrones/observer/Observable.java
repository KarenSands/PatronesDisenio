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
public interface Observable {
    public void addObserverToList(Pasajero pasajero);
    public void deleteObserverFromList(Pasajero pasajero);
    public void NotifyObservers();

}
