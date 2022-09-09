//**********************************************************************************************************************
//                              Activity 1 parts 1&2
//                              Name: Antone Thygerson
//                              Date: 8/31/2022
//**********************************************************************************************************************

package Chapter_1_to_2.Activity_1;
import javax.swing.*;
import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {

    }
//**********************************************************************************************************************
//  User enters first and last name.
//  Displays in upper, lower, and reverse cases
//
//**********************************************************************************************************************
    public static void part1(){
        Scanner ask = new Scanner(System.in);
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
    public static String reverse(String s){
        String re = "";
        for(int i=s.length()-1;i>=0;i--){
            re += s.charAt(i);
        }
        return re;
    }

//**********************************************************************************************************************
//  User enters numbers x and y
//  Adds, subtracts, multiplies, divides, square roots, powers and logarithms x and y
//
//**********************************************************************************************************************
    public static void part2(){
        Scanner ask = new Scanner(System.in);
        int x,y;
        System.out.print("X: ");
        //x = ask.nextInt();
        x = Integer.parseInt(JOptionPane.showInputDialog("X: "));
        System.out.print("Y: ");
        //y = ask.nextInt();
        y = Integer.parseInt(JOptionPane.showInputDialog("Y: "));
        String[] prints = {
                "addition","subtraction","multiplication","division","power","squareRootX","squareRootY","logX","logY"
        };
        double[] outputs = {
                x+y,x-y,x*y,(double)x/y,Math.pow(x,y),Math.pow(x,0.5),Math.pow(y,0.5),Math.log(x),Math.log(y)
        };
        for(int i=0;i<prints.length;i++){
            //System.out.println(prints[i]+": "+outputs[i]);
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),prints[i]+": "+outputs[i]);
        }
    }

}
