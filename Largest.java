// Program no : 19
// Largest among 3 numbers
/*
Output : Enter three numbers: 10 25 15
                    Largest = 25
*/

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));

        System.out.println("Largest = " + largest);
    }
}
