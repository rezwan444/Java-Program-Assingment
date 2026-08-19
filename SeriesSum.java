// Program no : 20
// sum of series
/*
Output : Enter n: 10
            Sum = 1.98828125
*/

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (double) i / Math.pow(2, i);
        }

        System.out.println("Sum = " + sum);
    }
}