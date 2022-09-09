package Chapter_1_to_2.Activity_7;

import java.util.Scanner;

public class whileLoopActivity {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        boolean isPlaying=true;
        int num = (int)(Math.random()*100),current,guesses=0;
        System.out.println("Enter a number 1-100 or press q to quit");
        while (isPlaying){
            String input = ask.next();
            if(input.equals("q")){
                System.out.printf("You quitter >:C, the number was %d",num);
                break;
            }else{
                current=Integer.parseInt(input);
            }
            guesses++;
            if(current==num){
                System.out.printf("\nCongrats the number is %d.\nIt only took %d guesses!",num,guesses);
                break;
            }else if(current<num){
                System.out.println("Too low");
            }else if(current>num){
                System.out.println("Too High");
            }
        }
    }

}
