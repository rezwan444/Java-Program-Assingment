/*
Program no : 25
Leap Year use of Ternary Operator

Output :     Enter year: 2024
             Leap Year
*/

import java.util.Scanner;

public class LeapYearUseTernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        String result = (year % 400 == 0 || 
                        (year % 4 == 0 && year % 100 != 0))
                        ? "Leap Year" : "Not Leap Year";

        System.out.println(result);
    }
}