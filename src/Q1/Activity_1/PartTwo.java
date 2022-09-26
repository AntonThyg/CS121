package Q1.Activity_1;
import javax.swing.*;
import java.util.Scanner;

//**********************************************************************************************************************
//                              Assignment #1
//                              Name: Antone Thygerson
//                              Date: 8/31/2022
//**********************************************************************************************************************
//  User enters numbers x and y
//  Adds, subtracts, multiplies, divides, square roots, powers and logarithms x and y
//
//**********************************************************************************************************************
public class PartTwo {
    static Scanner ask = new Scanner(System.in);
    public static void main(String[] args) {
        int x,y;
        System.out.print("X: ");
        //x = ask.nextInt();
        x = Integer.parseInt(JOptionPane.showInputDialog("X: "));
        System.out.print("Y: ");
        //y = ask.nextInt();
        y = Integer.parseInt(JOptionPane.showInputDialog("Y: "));
        String[] prints = {
                "addition","subtraction","multiplication","division","power","squareRootX","squareRootY","logX","logY"
        };
        double[] outputs = {
                x+y,x-y,x*y,(double)x/y,Math.pow(x,y),Math.pow(x,0.5),Math.pow(y,0.5),Math.log(x),Math.log(y)
        };
        for(int i=0;i<prints.length;i++){
            //System.out.println(prints[i]+": "+outputs[i]);
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),prints[i]+": "+outputs[i]);
        }
    }
}
