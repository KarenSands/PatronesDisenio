/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.Iterator;

/**
 *
 * @author karen
 */
public class IteratorController {
    
    public static void main(String[] args) {
       Civil civil = new Civil(); 
       Informatica informatica = new Informatica();
       Industrial industrial = new Industrial();
       Mecatronica mecatronica = new Mecatronica();
       Iterator alumnos;
       
        System.out.println("Lista de estudiantes de civil: ");
        alumnos = civil.createIterator();
        civil.printList(alumnos);
        
        System.out.println("Lista de estudiantes de informatica: ");
        alumnos = informatica.createIterator();
        informatica.printList(alumnos);
        
        System.out.println("Lista de estudiantes de industrial: ");
        alumnos = industrial.createIterator();
        industrial.printList(alumnos);
        
        System.out.println("Lista de estudiantes de mecatronica: ");
        alumnos = mecatronica.createIterator();
        mecatronica.printList(alumnos);
       
    }
    
}
