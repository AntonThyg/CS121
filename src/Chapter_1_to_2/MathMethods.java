package Chapter_1_to_2;

import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("Random Variable X:");
        int x = ask.nextInt();
        System.out.println("Random Variable Y:");
        int y = ask.nextInt();
        System.out.printf("Maximum of x and y is %d", Math.max(x,y));
    }
}
