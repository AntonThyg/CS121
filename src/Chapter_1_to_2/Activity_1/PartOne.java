package Chapter_1_to_2.Activity_1;
//**********************************************************************************************************************
//                              Assignment #1
//                              Name: Antone Thygerson
//                              Date: 8/31/2022
//**********************************************************************************************************************
//  User enters first and last name.
//  Displays in upper, lower, and reverse cases
//
//**********************************************************************************************************************

import java.util.Scanner;

public class PartOne {
    static Scanner ask = new Scanner(System.in);
    public static void main(String[] args) {
        String firstName, lastName;
        System.out.print("First Name: ");
        firstName = ask.nextLine();
        //firstName = JOptionPane.showInputDialog("First Name: ");
        System.out.print("Last Name: ");
        lastName = ask.nextLine();
        //lastName = JOptionPane.showInputDialog("Last Name: ");

        String name = firstName+" "+lastName;
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(reverse(name));

        //JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),name);
        //JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),name.toLowerCase());
        //JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),name.toUpperCase());
        //JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),reverse(name));
    }
//**********************************************************************************************************************
//  PartOne:Reverse()
//  Parameters: String s
//  Returns the contents of parameter s in reverse char order
//**********************************************************************************************************************
    public static String reverse(String s){
        String re = "";
        for(int i=s.length()-1;i>=0;i--){
            re += s.charAt(i);
        }
        return re;
    }
}
