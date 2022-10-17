package Review3;

import java.util.ArrayList;
import java.util.Scanner;

public class GradesArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter number of courses:");
        int num = Integer.parseInt(console.nextLine());
        System.out.println();

        ArrayList<String> courses = new ArrayList<>();
        ArrayList<Integer> hours = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        ArrayList<Character> grades = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int j = i + 1;
            System.out.printf("Enter course %d name:\n", j);
            courses.add(console.nextLine());
            System.out.printf("Enter course %d credit hours:\n", j);
            hours.add(Integer.parseInt(console.nextLine()));
            System.out.printf("Enter course %d score:\n", j);
            scores.add(Integer.parseInt(console.nextLine()));
            System.out.println();
        }

        for (int i = 0; i < num; i++) {
            if (scores.get(i) >= 90) {
                grades.add('A');
            } else if (scores.get(i) >= 80) {
                grades.add('B');
            } else if (scores.get(i) >= 70) {
                grades.add('C');
            } else if (scores.get(i) >= 60) {
                grades.add('D');
            } else {
                grades.set(i, 'F');
            }
        }

        System.out.printf("\n%-7s %-5s %-5s %-6s\n",
                "Course", "Hours", "Score", "Grade");
        for (int i = 0; i < num; i++) {
            System.out.printf("%-8s %-5d %-5d %-6c\n",
                    courses.get(i), hours.get(i), scores.get(i), grades.get(i));
        }
    }
}
