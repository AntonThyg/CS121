package Chapter_1_to_2;

import java.util.Scanner;

public class PrimitiveVariables {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        int age;
        String name;
        double bankBalance;
        char idk = 'q';

        age=18;
        bankBalance = Math.random();
        System.out.println("Enter your name:");
        name=ask.nextLine();

        System.out.println(name+" is "+ age + " and has $"+bankBalance+" dollars as a result of going to college");
        System.out.print(idk);
    }
}

