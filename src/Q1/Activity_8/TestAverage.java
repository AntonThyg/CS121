//**********************************************************************************************************************
//                              Activity 8
//                              Name: Antone Thygerson
//                              Date: 9/07/2022
//**********************************************************************************************************************
//  User enters the amount of students, and then the amount of tests they are scoring.
//  for each student, their test average is printed.
//
//**********************************************************************************************************************
package Q1.Activity_8;
import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        int students,scores;
        System.out.println("How many students?");
        students=ask.nextInt();
        System.out.println("How many tests");
        scores=ask.nextInt();
        for(int i=1;i<=students;i++){
            int total=0;
            double avg;
            System.out.printf("Student %d:",i);
            for(int o=1;o<=scores;o++){
                System.out.printf("Test Score %d:",o);
                total+=ask.nextInt();
            }
            avg=(double)total/scores;
            System.out.printf("Student %d has scored an average of %.2f%% on %d tests",i,avg,scores);
        }
    }
}
