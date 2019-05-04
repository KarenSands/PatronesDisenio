/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.proxy;

/**
 *
 * @author karen
 */
public class ProxyController {
    public static void main(String[] args) {
        Usuario us1 = new Usuario("Karen","Super");
        Usuario us2 = new Usuario("Luisa","Normal");
        
        ProxyFile p1 = new ProxyFile("index.html", us1);
        ProxyFile p2 = new ProxyFile("index.html", us2);
        
        System.out.println("El usuario "+ us1.getNombre()+ " es " + us1.getTipo());
        System.out.println("El usuario "+ us2.getNombre()+ " es " + us2.getTipo());
        
        System.out.println("Acciones de "+us1.getNombre());
        p1.borrar();
        p1.escribir();
        p1.leer();
        
        System.out.println("Acciones de "+us2.getNombre());
        p2.borrar();
        p2.escribir();
        p2.leer();
        
    }
}
