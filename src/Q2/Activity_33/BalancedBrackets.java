package Q2.Activity_33;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.printf("\n(): %s", checkBalance("()"));
        System.out.printf("\n(()()): %s", checkBalance("(()())"));
        System.out.printf("\n(()())): %s", checkBalance("(()()))"));
    }

    public static String checkOpenBalance(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                stack.push(c);
            }else{
                stack.pop();
            }
        }
        if(stack.empty()){
            return "balanced";
        }else{
            return "unbalanced";
        }
    }
    public static String checkCloseBalance(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==')'){
                stack.push(c);
            }else{
                stack.pop();
            }
        }
        if(stack.empty()){
            return "balanced";
        }else{
            return "unbalanced";
        }
    }
    public static String checkBalance(String s){
        return String.format("Open: %s, Close: %s",checkOpenBalance(s),checkCloseBalance(s));
    }
}
