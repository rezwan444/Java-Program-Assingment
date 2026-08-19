// Program no : 16
// Number Swap program
/*Output :
Enter first number: 10
Enter second number: 20

After swapping:
First number = 20
Second number = 10
 */

import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}