//**********************************************************************************************************************
//                              Activity 3 parts 1-3
//                              Name: Antone Thygerson
//                              Date: 9/07/2022
//**********************************************************************************************************************
//  Compilation of all 3 parts of Activity 3
//
//
//**********************************************************************************************************************
package Chapter_1_to_2.Activity_3;

import javax.swing.*;
import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {

    }
//**********************************************************************************************************************
//  User enters username and password.
//  If the username and password match preset variables then "Welcome to CS121" dialogue is shown
//  Specifies if username or password are incorrect or if both.
//**********************************************************************************************************************
    public static void evenOdd(){
        Scanner ask = new Scanner(System.in);
        System.out.println("Number: ");
        int num = ask.nextInt();
        if(num%2==0){
            System.out.println(num+" is even.");
        }else{
            System.out.println(num+" is odd.");
        }
    }
//**********************************************************************************************************************
//  User enters an integer.  If the integer is even it prints even, if odd it prints odd.
//
//
//**********************************************************************************************************************
    public static void login(){
        String username = "admin",password="password";
        String inpUser= JOptionPane.showInputDialog("Username: "),inpPass=JOptionPane.showInputDialog("Password: ");
        boolean correctUser=inpUser.equals(username),correctPass=inpPass.equals(password);
        if(correctUser&&correctPass){
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Welcome to CS121");
        }else if(!correctPass&&correctUser){
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Password is incorrect!");
        }else if(!correctUser&&correctPass){
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Username is incorrect!");
        }else if(!correctPass&&!correctUser){
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Username and Password are incorrect");
        }
    }
//**********************************************************************************************************************
//  User enters 3 side lengths of a triangle.
//  If all sides are equal, prints Equilateral. If 2 sides are equal, prints Isosceles.
//  If no sides are equal, prints scalene.
//**********************************************************************************************************************
    public static void triangles(){
        Scanner ask = new Scanner(System.in);
        int[] sides = new int[3];
        for(int i=0;i< sides.length;i++){
            System.out.printf("\nLength of side %d: ",i+1);
            sides[i]=ask.nextInt();
        }
        boolean equal=sides[0]==sides[1]&&sides[1]==sides[2];
        boolean iso=sides[0]==sides[1]||sides[1]==sides[2]||sides[0]==sides[2];
        boolean scalene=sides[0]!=sides[1]&&sides[1]!=sides[2]&&sides[0]!=sides[2];
        System.out.printf("\nThe triangle is %s",triangle(equal,iso,scalene));
    }
    public static String triangle(boolean equilateral, boolean isosceles, boolean scalene){
        if(equilateral){
            return "Equilateral";
        }else if(isosceles){
            return "Isosceles";
        }
        return "Scalene";

    }
}
