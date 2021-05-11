package com.company;

public class Main {

    public static void main(String[] args) {


    StudentManager studentManager=new StudentManager();

    InstructionManager instructionManager=new InstructionManager();
    Student student=new Student();
    Instructor engin=new Instructor();
    engin.setId(25);
    student.setId(2);
    engin.setCourses("Java-React");
    Instructor engin2=new Instructor();
    engin2.setCourses("c# angular");
    Instructor[] instructors={engin,engin2};
    instructionManager.addMultiple(instructors);

    //studentManager.add(student);
    //instructionManager.add(instructor);
    UserManager userManager=new UserManager();
    User[] users={engin,student};
    userManager.addMultiple(users);
    }
}
