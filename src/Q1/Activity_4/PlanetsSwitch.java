//**********************************************************************************************************************
//                              Activity 4
//                              Name: Antone Thygerson
//                              Date: 9/07/2022
//**********************************************************************************************************************
//  User enters the name of a planet. Program prints the planet's mass
//
//
//**********************************************************************************************************************
package Q1.Activity_4;

import java.util.Scanner;

public class PlanetsSwitch {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("Planet: ");
        String planet = ask.next();
        String mass = "";
        switch (planet){
            case "mercury":
                mass = "3.285e23";
            case "venus":
                mass = "4.867e24";
            case "earth":
                mass = "5.972e24";
            case "mars":
                mass = "6.39e23";
            case "jupiter":
                mass = "1.898e27";
            case "saturn":
                mass = "5.683e26";
            case "neptune":
                mass = "1.024e26";
            case "uranus":
                mass = "8,681e25";
            case "pluto":
                mass = "1.309e22";
        }
        System.out.printf("The mass of %s is %s",planet,mass);
    }
}
