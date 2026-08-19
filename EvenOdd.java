// program no : 06
// Even and Odd Number
// output : Even Number : 10, 20, 2, 4
//          Odd number  : 1, 3, 5, 13, 15, 19

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}