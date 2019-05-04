/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.DAO;
import com.github.javafaker.Faker;
import java.util.concurrent.atomic.AtomicInteger;
/**
 *
 * @author karen
 */
public class Student {
   private String name;
   private int id;
   private static final AtomicInteger count = new AtomicInteger(-1); 

   Student(String name, int rollNo){
      Faker faker = new Faker();

        this.name = faker.name().fullName();
        id = count.incrementAndGet(); 
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getRollNo() {
      return id;
   }

   public void setRollNo(int rollNo) {
      this.id = rollNo;
   }
}
