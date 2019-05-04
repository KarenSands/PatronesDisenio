/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author karen
 */
public class Civil {
    String nombre;
    Queue<String> alumnos = new LinkedList<>();

    public Civil() {
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
        
    public Iterator<String> createIterator(){
        return alumnos.iterator();
    }
    
    public Queue getArrayList(){
        return alumnos;
    }
    
        public void printList(Iterator list) {
	while (list.hasNext()) {
            String alumno = (String)list.next();
            System.out.println(alumno);
        }
    }
}
