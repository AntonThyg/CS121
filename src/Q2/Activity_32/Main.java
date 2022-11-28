package Q2.Activity_32;

public class Main {
    public static void main(String[] args) {
        Student me = new Student("Antone Thygerson",0,"CS","Sophomore");
        Student friend1 = new Student("Ethan Couch",1,"CS","Freshman");

        me.addCourse("CS121");
        me.addCourse("CS124");
        me.addCourse("ENG103");
        me.addCourse("SP301");
        System.out.println(me.getStudentInfo());
        me.displayCourses();
        me.removeCourse("ENG103");
        me.displayCourses();
        friend1.addCourse("CS120");
        friend1.addCourse("HIST150");
        friend1.addCourse("AHS100");
        friend1.addCourse("FIN101");
        System.out.println(friend1.getStudentInfo());
        friend1.displayCourses();
        friend1.removeCourse("AHS100");
        friend1.displayCourses();

    }
}
