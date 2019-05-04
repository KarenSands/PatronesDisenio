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
public class TemplateController {
    public static void main(String[] args) {
        
        Catalogo p1 = new Persona("karen", "Calle Rosas", 21);
        Catalogo auto1 = new Producto("123456789", 1234);
        
        System.out.println("Información de la persona 1:");
        p1.update(22);
        System.out.println("Update hecho......");
        System.out.println("La nueva información de la persona 1 es: ");
        p1.leerDatos();
        
        System.out.println("");
        
        System.out.println("Toyota Yaris");
        auto1.update(9876);
        System.out.println("Update hecho......");
        System.out.println("Precio nuevo:");
        auto1.leerDatos();
    }    
}
