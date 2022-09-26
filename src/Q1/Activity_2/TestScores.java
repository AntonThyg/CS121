//**********************************************************************************************************************
//                              Activity 3 part 1
//                              Name: Antone Thygerson
//                              Date: 9/02/2022
//**********************************************************************************************************************
//  User enters an integer.  Program prints Even if int is even and odd if int is odd.
//
//
//**********************************************************************************************************************
package Q1.Activity_2;

import java.util.Arrays;
import java.util.Scanner;


public class TestScores {
    static Scanner ask = new Scanner(System.in);
    public static void main(String[] args) {
        int size,total;
        double average;
        System.out.println("How many tests are you scoring");
        size=ask.nextInt();
        int[] testScores = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Test Score "+(i+1)+": ");
            testScores[i]=ask.nextInt();
            //testScores[i]=Integer.parseInt(JOptionPane.showInputDialog("Test Score "+i+": "));
            System.out.println(letterGrade(testScores[i]));
        }
        double avg = Arrays.stream(testScores).average().getAsDouble();
        System.out.println("Grade: "+avg+"|"+letterGrade(avg));

    }
//**********************************************************************************************************************
//  TestScores:letterGrade(int i)
//  Parameters: int i
//  returns letter grade based on integer input (F<60,D=60-69,C=70-79,B=80-89,A=90-100)
//**********************************************************************************************************************
    public static char letterGrade(double i){
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
