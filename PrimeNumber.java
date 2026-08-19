// Program no : 02
// Prime Number

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // user input
        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();
        
        boolean isPrime = true;
        
        // not prime number 0 and 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // main loop for check prime number
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // jodi mile jai to code theme jabe
                    break;
                }
            }
        }
        
        // result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
        
        scanner.close();
    }
}