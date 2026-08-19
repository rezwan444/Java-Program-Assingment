/*
Program no : 22
Student class with 3 object

Output : Enter 3 students name and age: Nayem 23 Nabil 22 Rayhan 25
                                        Nayem 23
                                                 Nabil 24
                                                          Rayhan 25
*/

import java.util.Scanner;

class Student {
    String name;
    int age;

    void show() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.print("Enter 3 students name and age: ");

        s1.name = sc.next();
        s1.age = sc.nextInt();

        s2.name = sc.next();
        s2.age = sc.nextInt();

        s3.name = sc.next();
        s3.age = sc.nextInt();

        s1.show();
        s2.show();
        s3.show();
    }
}