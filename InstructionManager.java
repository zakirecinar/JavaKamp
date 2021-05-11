package com.company;

public class InstructionManager extends UserManager {
    public void add(Instructor instructor) {
        System.out.println(instructor.getCourses() + " isimli kurs eklenmiştir");
    }

    public void addMultiple(Instructor[] instructors) {
        for (Instructor instructor : instructors) {
            add(instructor);
        }
    }

}
