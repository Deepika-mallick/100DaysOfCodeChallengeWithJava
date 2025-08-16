package arrays.array1D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of students: ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ": ");
            String name = sc.next();
            sc.nextLine();
            System.out.println("Enter the age of the student " + (i + 1) + ": ");
            int age = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(name, age);
        }

        System.out.println("Student Details:");
        for (Student s : students) {
            s.display();
        }
        sc.close();
    }
}
