package Q2.Activity_32;

import java.util.LinkedList;

public class Student {
    String name,major,classStanding;
    int id;
    double gpa;
    LinkedList<String> courses = new LinkedList<>();
    public Student(String name, int id, String major, String classStanding){
        this.name=name;
        this.id=id;
        this.major=major;
        this.classStanding=classStanding;
    }
    public void addCourse(String course){
        courses.add(course);
    }
    public void removeCourse(String course){
        courses.remove(course);
    }
    public void displayCourses(){
        System.out.print("Courses: ");
        for(String s:courses){
            System.out.print(s+", ");
        }
        System.out.println();
    }
    public String getStudentInfo(){
        return String.format("[Name: %s, ID: %d, Major: %s, Class: %s]",name,id,major,classStanding);
    }
}
