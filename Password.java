/*
Program no : 21
Passwor - (do -while)

Output : Enter password: 111111
         Enter password: 222222
         Enter password: 515363
         Access Granted!
*/

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextInt();
        } while (password != 515363);

        System.out.println("Access Granted!");
    }
}