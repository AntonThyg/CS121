package Q2.Activity_23;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(palendrome("racecar",0));
        System.out.println(palendrome("race",0));
    }
    public static boolean palendrome(String s, int i){
        if(i<s.length()){
            if(s.charAt(i)==s.charAt(s.length()-1-i)){
                return palendrome(s,i++);
            }else{
                return false;
            }
        }
        return true;
    }
}
