package Q1.Activity_11;

import java.util.Scanner;

public class MethodActivity {
    static Scanner ask = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(getArea(getLength(),getWidth()));
        ask.close();
    }
    public static int getArea(int l, int w){
        System.out.println("Area is: ");
        return l*w;
    }
    public static int getLength(){
        System.out.println("Length");
        return ask.nextInt();
    }
    public static int getWidth(){
        System.out.println("Width:");
        return ask.nextInt();
    }

}
