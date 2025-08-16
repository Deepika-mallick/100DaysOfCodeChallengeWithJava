package arrays.array1D;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println(name + " is " + age + " Years old.");
    }
}
