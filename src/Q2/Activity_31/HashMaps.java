package Q2.Activity_31;

import java.util.HashMap;
import java.util.Set;

public class HashMaps {
    HashMap<Integer,String> hashMap = new HashMap();
    public HashMaps(){}
    public void add(int i,String s){
        hashMap.put(i,s);
    }
    public void remove(int i){
        hashMap.remove(i);
    }
    public void remove(int i,String s){
        hashMap.remove(i,s);
    }
    public String get(int i){
        return hashMap.get(i);
    }
    public Set<Integer> getKeys(){
        return hashMap.keySet();
    }
    public void printHash(){
        for(int i:hashMap.keySet()){
            System.out.printf("%d=%s ",i,hashMap.get(i));
        }
        System.out.println();
    }
}
