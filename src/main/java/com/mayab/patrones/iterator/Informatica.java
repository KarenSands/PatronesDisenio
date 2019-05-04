/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author karen
 */
public class Informatica {
    String nombre; 
    ArrayList alumnos = new ArrayList();
    
    public Informatica(){
        alumnos.add("Karen");
        alumnos.add("Gabriel");
        alumnos.add("Emilio");
        alumnos.add("Tony");
        alumnos.add("Pamela");
        alumnos.add("Henry");
        alumnos.add("Alan");
        alumnos.add("Sebastian");
        alumnos.add("Benjamín");
        alumnos.add("Luis");
    }
    
     public Iterator createIterator(){
        return alumnos.iterator();
    }
     
    public ArrayList getArrayList(){
        return alumnos;
    }
    
    public void añadir(String x){
        alumnos.add(x);
    }
        public void printList(Iterator list) {
	while (list.hasNext()) {
            String alumno = (String)list.next();
            System.out.println(alumno);
        }
    }
}
