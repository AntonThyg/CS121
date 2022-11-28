package Q2.Activity_30;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(List.of(1,2,3,4,5));
        ArrayList<Double> doubles = new ArrayList<>(List.of(1.1,2.2,3.3,4.4,5.5));
        ArrayList<Character> chars = new ArrayList<>(List.of('A','B','C','D','E'));
        ArrayList<String> strings = new ArrayList<>(List.of("Alpha","Beta","Gamma","Delta","Epsilon"));

        System.out.print("Integers: ");
        printArrayList(ints);
        System.out.print("Doubles: ");
        printArrayList(doubles);
        System.out.print("Chars: ");
        printArrayList(chars);
        System.out.print("Strings: ");
        printArrayList(strings);
    }
    public static <E> void printArrayList(ArrayList<E> a){
        for(E element: a){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
}
