package com.ironhack.w1.d3;
import java.util.Scanner;

public class ScannerValidateAge {
    public static void main(String[] args) {
        ScannerValidateAge test = new ScannerValidateAge();
        test.validateAge();
    }

    private void validateAge() {
        Scanner scanner = new Scanner(System.in);

        int age;
        do {
            System.out.print("Please enter your age");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid age.%n", input);
            }
            age = scanner.nextInt();
        } while (age < 0);
        System.out.printf("You have entered a valid age %d.%n", age);
    }
}
