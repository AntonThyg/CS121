//**********************************************************************************************************************
//                              Activity 3 part 3
//                              Name: Antone Thygerson
//                              Date: 9/07/2022
//**********************************************************************************************************************
//  User enters 3 side lengths of a triangle.
//  If all sides are equal, prints Equilateral. If 2 sides are equal, prints Isosceles.
//  If no sides are equal, prints scalene.
//**********************************************************************************************************************
package Chapter_1_to_2.Activity_3;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        int[] sides = new int[3];
        for(int i=0;i< sides.length;i++){
            System.out.printf("\nLength of side %d: ",i+1);
            sides[i]=ask.nextInt();
        }
        boolean equal=sides[0]==sides[1]&&sides[1]==sides[2];
        boolean iso=sides[0]==sides[1]||sides[1]==sides[2]||sides[0]==sides[2];
        boolean scalene=sides[0]!=sides[1]&&sides[1]!=sides[2]&&sides[0]!=sides[2];
        System.out.printf("\nThe triangle is %s",triangle(equal,iso,scalene));
    }
    public static String triangle(boolean equilateral, boolean isosceles, boolean scalene){
        if(equilateral){
            return "Equilateral";
        }else if(isosceles){
            return "Isosceles";
        }
        return "Scalene";

    }
}
