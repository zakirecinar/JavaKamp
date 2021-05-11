package com.company;

public class StudentManager extends UserManager {
      public void add(Student student){
      System.out.println(student.getId()+" Numaralı öğrenci eklenmiştir.");
  }
      public void addMultiple(Student[] students){
      for (Student student:students){
          add(student);
      }
  }
}
