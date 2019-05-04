/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.DAO;

/**
 *
 * @author karen
 */
public class DaoController{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StudentDao studentDao = new StudentDaoImpl();

      //print all students
      for (Student student : studentDao.getAllStudents()) {
         System.out.println("Student: [id : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
      }

        
      //update student
      System.out.println("updating name to michael");
      Student student =studentDao.getAllStudents().get(0);
      student.setName("Michael");
      studentDao.updateStudent(student);

      //get the student
      System.out.println("getting the student modified");
      studentDao.getStudent(0);
      System.out.println("Student: [id : " + student.getRollNo() + ", Name : " + student.getName() + " ]");	
    }
    
}
