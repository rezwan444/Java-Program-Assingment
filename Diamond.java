// Program no : 15
// Java Diamond Shape program
// Output : Enter a number of rows : 10

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n * 2 - 1; i++) {

            int row = i <= n ? i : 2 * n - i;

            for (int j = 1; j <= n - row; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * row - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}