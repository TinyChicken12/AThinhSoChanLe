package CG_Test;

import java.util.Scanner;

public class SoLeChan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter number (number >0 and number <=100): ");
        number = scanner.nextInt();
        if (number < 1 || number > 100) {
            System.out.println("number invalid, it should be in range of 1 and 100");
        } else {
            if (number % 2 == 0)
                System.out.println("The number is Even");
            else
                System.out.println("The number is odd");

        }

    }
}