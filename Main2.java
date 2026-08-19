/*
Program no : 23
Use of local and instance variable

Output :      Enter age: 20
            Enter marks: 85
                   Age = 20
                 Marks = 85
*/

import java.util.Scanner;

class Student {
    int age;   // Instance variable

    void show() {
        int marks;   // Local variable

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter marks: ");
        marks = sc.nextInt();

        System.out.println("Age = " + age);
        System.out.println("Marks = " + marks);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}
