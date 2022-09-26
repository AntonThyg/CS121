//**********************************************************************************************************************
//                              Activity 9
//                              Name: Antone Thygerson
//                              Date: 9/07/2022
//**********************************************************************************************************************
//  Random color is picked from a list.  User guesses a random color.  Their correct guesses are added to teh total.
//  After 10 rounds the total and percentage correct is printed.
//
//**********************************************************************************************************************
package Q1.Activity_9;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        String[] colors = {"red","green","blue","orange","yellow"};
        int guesses=0,correct=0;
        for(int i=1;i<=10;i++){
            System.out.println("\nGuess the color");
            String guess = ask.next();
            guesses++;
            String current = colors[(int)(Math.random()*5)];
            if(guess.equals(current)){
                correct++;
            }
            System.out.printf("\nComputer chose %s",current);
        }
        System.out.printf("\n%d correct out of %d total guesses (%d%%)",correct,guesses,(int)(((double)correct/guesses)*100));
    }
}
