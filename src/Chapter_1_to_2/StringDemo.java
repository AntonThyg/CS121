package Chapter_1_to_2;

public class StringDemo {
    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Doe";
        String fullName = String.format("%s %s",firstName,lastName);

        int age = 20;
        double gpa = 3.8;
        char grade = 'A';

        String info = String.format("name: %s\n age: %d\n gpa: %.1f\n grade: %c\n",fullName,age,gpa,grade);
        System.out.println(info);
        System.out.printf("name: %s\n age: %d\n gpa: %.1f\n grade: %c\n",fullName,age,gpa,grade);

        String name = "John"+" "+"Doe";
        System.out.printf("0. %s\n",name);
        System.out.printf("1. %s\n",name.replace("John","Jane"));
        System.out.printf("2. %s\n",name);
        name = name.replace("John","Jane");
        System.out.printf("3. %s\n",name);

        System.out.printf("Number of characters: %d\n\n", name.length());

        System.out.printf("%s\n",name.toUpperCase());
        System.out.printf("%s\n",name.toLowerCase());
        System.out.printf("%s\n\n",name);

        System.out.printf("Initials: %s.%s.\n\n", name.charAt(0),name.charAt(5));

        System.out.printf("First name: %s\nLast name: %s\n\n",name.substring(0,4),name.substring(5,8));
    }


}
