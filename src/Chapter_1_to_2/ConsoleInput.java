package Chapter_1_to_2;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName = console.nextLine();
        System.out.println("Last Name: ");
        String lastName = console.nextLine();

        System.out.printf("Full Name: %s %s",firstName,lastName);

        console.close();
    }
}
