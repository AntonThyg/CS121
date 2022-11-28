package Q2.Activity_29;

import java.util.*;

public class StudentSet {
    public StudentSet(){

    }
    private Set<String> students = new HashSet<String>();

    private final Scanner ask = new Scanner(System.in);

    public void addStudents(){
        System.out.println("How many students would you like to add?");
        int num = ask.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("Enter student "+(i+1));
            students.add(ask.next());
        }
    }
    public void displayStudents(){
        for(String s:students){
            System.out.println(s);
        }
    }
}
