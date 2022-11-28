package Q2.Activity_23;

public class RecursionTracing {
    public static void main(String[] args) {
        System.out.println(factorial(11));
        System.out.println(gcd(6,3));
        System.out.println(gcd(10,2));
        System.out.println(gcd(20,6));
    }
    /*
    1. Identify the base Case for both of these functions.
    Base case is 0,1 where when n=0 it returns 1 and breaks the loop.

    2. Trace through the functions where n is 11.
    11*10*9*8*7*6*5*4*3*2*1=39916800
    */
    private static int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }


    /*
    1. Identify the base Case for both of these functions.
    the base case is x is evenly divisible by y, so it will return y.
    2. Trace through the functions where
    x is 6 and y is 3
    6 is evenly divisible by 3 so it will return 3 after only 1 parse.

    x is 10 and y is 2
    again, 10 is evenly divisible by 2 so it will parse through it once and return 2.

    */

    //Use:to check answer: http://www.alcula.com/calculators/math/gcd/#gsc.tab=0

    public static int gcd(int x, int y)
    {
        if (x % y == 0)
            return y;
        else
            return gcd(y, x % y);
    }
}
