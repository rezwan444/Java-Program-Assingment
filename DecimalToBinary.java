// Program no : 17
// Decimal to Binary Number
// Output : Enter a Decimal Number : 10
//                          Binary : 1010

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        String binary = "";

        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }

        System.out.println("Binary = " + binary);
    }
}