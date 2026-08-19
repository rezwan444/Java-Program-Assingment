// Program no : 18
// Simple calculator - switch case
/*
Output : Enter two numbers: 10 5
            Enter operator: *
                Result = 50.0
*/


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.print("Enter operator: ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result = " + (a + b)); break;
            case '-': System.out.println("Result = " + (a - b)); break;
            case '*': System.out.println("Result = " + (a * b)); break;
            case '/': System.out.println("Result = " + (a / b)); break;
            default: System.out.println("Invalid Operator");
        }
    }
}