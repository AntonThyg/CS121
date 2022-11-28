package Q2.Activity_27;

import java.util.Scanner;

public class Sort {
    static Scanner ask = new Scanner(System.in);
    public Sort(){}
    public int[] getArray(){
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter number "+(i+1));
            arr[i]=ask.nextInt();
        }
        return arr;
    }
    public String toString(int[] i){
        String s = "[";
        for(int o:i){
            s+=o+", ";
        }
        s+="]";
        return s;
    }
    public int[] InsertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int o=0;o<i;o++){
                if(arr[o]>arr[i]){
                    int n = arr[i];
                    arr[i]=arr[o];
                    arr[o]=n;
                }
            }
        }
        return arr;
    }


}
