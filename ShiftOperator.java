/*
Program no : 24
Use of shift operator

Left Shift  = [ left number x 2 ]
Right Shift = [ right number / 2 ]

Output :      Enter a number: 10
        Left Shift (n << 1) = 20
        Right Shift (n >> 1) = 5
*/

import java.util.Scanner;

public class ShiftOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Left Shift (n << 1) = ");
        System.out.println(n << 1);

        System.out.print("Right Shift (n >> 1) = ");
        System.out.println(n >> 1);
    }
}