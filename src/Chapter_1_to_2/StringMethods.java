package Chapter_1_to_2;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);

        System.out.println("Home Town");
        String town = ask.next();
        System.out.println("Home State");
        String state = ask.next();
        System.out.println("Home City");
        String city = ask.next();
        Boolean equals = town.equals(city);
        Boolean equivalent = town.equalsIgnoreCase(city);
        System.out.println(equals);
        System.out.println(equivalent);

        String homeTown = town.concat(", "+state);
        String upper = homeTown.toUpperCase();
        String lower = homeTown.toLowerCase();
        char letter = homeTown.charAt(4);
        int size = homeTown.length();
        boolean empty = homeTown.isEmpty();

        System.out.printf("Hometown: %s\n",homeTown);
        System.out.printf("Hometown: %s\n",upper);
        System.out.printf("Hometown: %s\n",lower);
        System.out.printf("Letter: %s\n",letter);
        System.out.printf("Sie]ze: %s\n",size);
        System.out.printf("Empty?: %s\n",empty);
    }
}
