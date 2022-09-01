package Chapter_1_to_2.ConditionalsActivity;

import javax.swing.*;
import java.util.Scanner;

//**********************************************************************************************************************
//                              Assignment #1
//                              Name: Antone Thygerson
//                              Date: 9/01/2022
//**********************************************************************************************************************
//
//
//
//**********************************************************************************************************************
public class TestScores {
    static Scanner ask = new Scanner(System.in);
    public static void main(String[] args) {
        int size,total;
        double average;
        System.out.println("How many tests are you scoring");
        size=ask.nextInt();
        int[] testScores = new int[size];
        char[] testGrades = new char[size];
        for(int i=0;i<size;i++){
            System.out.print("Test Score "+(i+1)+": ");
            testScores[i]=ask.nextInt();
            //testScores[i]=Integer.parseInt(JOptionPane.showInputDialog("Test Score "+i+": "));
            System.out.println(letterGrade(testScores[i]));
        }
    }
//**********************************************************************************************************************
//  TestScores:letterGrade(int i)
//  Parameters: int i
//  returns letter grade based on integer input (F<60,D=60-69,C=70-79,B=80-89,A=90-100)
//**********************************************************************************************************************
    public static char letterGrade(int i){
        if(i<60){
            return 'F';
        }else if(i>=60&&i<70){
            return 'D';
        }else if(i>=70&&i<80){
            return 'C';
        }else if(i>=80&&i<90){
            return 'B';
        }
        return 'A';
    }
}
