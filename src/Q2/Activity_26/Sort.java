package Q2.Activity_26;

import java.util.Scanner;

public class Sort {
    static Scanner ask = new Scanner(System.in);
    public Sort(){
    }
    public int[] getArray(int size){
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Insert number "+(i+1));
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
    public int[] bubbleSort(int[] arr){
        for(int n=0;n<arr.length;n++){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int o = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=o;
                }
            }
        }
        return arr;
    }
}
