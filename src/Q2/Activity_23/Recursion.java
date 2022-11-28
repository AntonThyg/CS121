package Q2.Activity_23;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(palendrome("racecar"));
        System.out.println(palendrome("race"));
        System.out.println(characterCount("good boi",'o'));
        System.out.println(characterCount("rubber ducky",'u'));
    }
    public static boolean palendrome(String s){
        if(s.length()<=1){
           return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return palendrome(s.substring(1,s.length()-1));
        }else {
            return false;
        }
    }
    public static int characterCount(String s, char c){
        if(s.length()==0){
            return 0;
        }
        if(s.charAt(0)==c){
            return 1+characterCount(s.substring(1),c);
        }else{
            return characterCount(s.substring(1),c);
        }
    }
}
