package Q2.Activity_26;

import java.util.Scanner;

public class Main {
    static Scanner ask = new Scanner(System.in);
    public static void main(String[] args) {
        Sort sort = new Sort();
        System.out.println("How many numbers are you sorting?");
        int[] x = sort.getArray(ask.nextInt());
        System.out.println("Unsorted array: "+sort.toString(x));
        System.out.println("Sorted array: "+sort.toString(sort.bubbleSort(x)));
    }
}
