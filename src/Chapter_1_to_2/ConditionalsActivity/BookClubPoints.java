package Chapter_1_to_2.ConditionalsActivity;

import javax.swing.*;
import java.util.Scanner;

//**********************************************************************************************************************
//                              Assignment #1
//                              Name: Antone Thygerson
//                              Date: 8/31/2022
//**********************************************************************************************************************
//  User enters amount of books purchased.
//  assigns them points based on purchases
//  books to points 0:0,1:5,2:15,3:30,4:60
//**********************************************************************************************************************
public class BookClubPoints {
    static Scanner ask = new Scanner(System.in);
    public static void main(String[] args) {
        int booksPurchased,points=0;
        System.out.print("How many books have you purchased each month? ");
        booksPurchased = ask.nextInt();
        //booksPurchased = Integer.parseInt(JOptionPane.showInputDialog("How many books have you purchased each month? "));
        if(booksPurchased==1){
            points=5;
        }else if(booksPurchased==2){
            points=15;
        }else if(booksPurchased==3){
            points=30;
        }else if(booksPurchased>=4){
            points=60;
        }
        System.out.println("Points: "+points);
        //JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Points: "+points);
    }
}
