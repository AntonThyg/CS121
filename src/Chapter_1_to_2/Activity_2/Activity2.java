//**********************************************************************************************************************
//                              Activity 2 part 1&2
//                              Name: Antone Thygerson
//                              Date: 9/02/2022
//**********************************************************************************************************************
package Chapter_1_to_2.Activity_2;
import java.util.Arrays;
import java.util.Scanner;

public class Activity2 {
    static Scanner ask = new Scanner(System.in);
    public static void main(String[] args) {

    }
//**********************************************************************************************************************
//  User enters amount of books purchased.
//  assigns them points based on purchases
//  books to points 0:0,1:5,2:15,3:30,4:60
//**********************************************************************************************************************
    public static void bookClub(){
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

//**********************************************************************************************************************
//  User enters an integer.  Program prints Even if int is even and odd if int is odd.
//
//
//**********************************************************************************************************************
    public static void testScores(){
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
