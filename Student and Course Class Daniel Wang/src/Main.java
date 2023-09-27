import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student Daniel = new Student("Daniel");
        System.out.println("Name: " + Daniel.getFirstName());
        System.out.println("ID Number: " + Daniel.getId());
        System.out.println("Courses:");
        Daniel.addCourse(new Course("English", 98));
        Daniel.addCourse(new Course("Math", 90));
        Daniel.addCourse(new Course("Law", 98));
        Daniel.addCourse(new Course("Biology", 90));
        Daniel.addCourse(new Course("Chemistry", 98));
        Daniel.addCourse(new Course("Physics", 90));
        Daniel.ridCourse(2);
        Daniel.displaycourses();
        System.out.println("Average: " + Daniel.getavg());

        Student David = new Student("David");
        System.out.println("Name: " + David.getFirstName());
        System.out.println("ID Number: " + David.getId());
        System.out.println("Courses:");
        David.addCourse(new Course("English", 98));
        David.addCourse(new Course("Math", 40));
        David.addCourse(new Course("Law", 20));
        David.addCourse(new Course("Biology", 20));
        David.addCourse(new Course("Chemistry", 98));
        David.addCourse(new Course("Physics", 90));
        David.ridCourse(4);
        David.displaycourses();
        System.out.println("Average: " + David.getavg());









    }
}