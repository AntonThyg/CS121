package Q2.Activity_28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Binary {
    static Scanner ask = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(List.of(1,2,3,4,5));
        binarySearch(ints,0,4,1);
        binarySearch(ints,0,4,4);
    }
    static ArrayList<Integer> getArrayList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.println("Input Number "+(i+1)+":");
            arrayList.add(ask.nextInt());
        }
        return arrayList;
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
    static String toString(ArrayList<Integer> arr){
        String s = "[";
        for(int i:arr){
            s+=i+", ";
        }
        s+="]";
        return s;
    }
    public static void binarySearch(ArrayList<Integer> arr, int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr.get(mid) < key ){
                first = mid + 1;
            }else if ( arr.get(mid) == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }

}
