package Chapter_1_to_2.Activity_3;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("Number: ");
        int num = ask.nextInt();
        if(num%2==0){
            System.out.println(num+" is even.");
        }else{
            System.out.println(num+" is odd.");
        }
    }
}
