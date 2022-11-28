package Q2.Activity_31;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashMaps hash = new HashMaps();
        hash.add(1,"A");
        hash.add(2,"B");
        hash.add(3,"C");
        hash.printHash();
        int remove = (int)(Math.random()*3);
        hash.remove(remove,hash.get(remove));
        hash.printHash();
    }

}
