/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import edu.emory.mathcs.backport.java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author karen
 */
public class Mecatronica {
    String nombre;
    String[] alumnos= new String[10];
    
    public Mecatronica() {
        alumnos[0] = "Karen";
        alumnos[1] = "Gabriel";
        alumnos[2] = "Emilio";
        alumnos[3] = "Tony";
        alumnos[4] = "Pamela";
        alumnos[5] = "Henry";
        alumnos[6] = "Alan";
        alumnos[7] = "Sebastian";
        alumnos[8] = "Benjamín";
        alumnos[9] = "Luis";
    }
        
    public Iterator createIterator(){
        return Arrays.asList(alumnos).iterator();
    }
    
    public String[] getArrayList(){
        return alumnos;
    }
    
    public void printList(Iterator list) {
	while (list.hasNext()) {
            String alumno = (String)list.next();
            System.out.println(alumno);
        }
    }
    
}
