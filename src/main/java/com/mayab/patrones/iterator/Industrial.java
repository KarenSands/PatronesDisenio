/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author karen
 */
public class Industrial {
    String nombre;
    List alumnos = new ArrayList();
    
    public Industrial(){
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
     
    public List getArrayList(){
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
