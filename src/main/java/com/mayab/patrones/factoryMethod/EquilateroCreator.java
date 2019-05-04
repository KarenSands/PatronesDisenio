/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.factoryMethod;

/**
 *
 * @author karen
 */
public class EquilateroCreator extends TrianguloCreator{
           @Override
    public Triangulo createTriangulo(String tipo){
        if(tipo.equals("equilatero")){
            return new Equilatero();
        } 
        return null;
    }
}
