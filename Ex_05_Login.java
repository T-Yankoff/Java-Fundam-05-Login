package _06_Basic_Sintax_Conditional_Statements;

import java.util.Scanner;

public class Ex_05_Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();

        String inputPass = scan.nextLine();
        String pass = "";

        int length = username.length();
        for (int i = length - 1; i >= 0; i--) {
            char digit = username.charAt(i);
            pass += digit;
        }

        int logCount = 0;
        while (!pass.equals(inputPass)) {
            logCount ++;
            if (logCount == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            inputPass = scan.nextLine();

        }
        if (pass.equals(inputPass)) {
            System.out.printf("User %s logged in.\n", username);
        }


    }
}
