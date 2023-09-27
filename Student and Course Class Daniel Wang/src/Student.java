import java.util.List;
import java.util.ArrayList;

public class Student {
    ///fields
    private String firstName;
    private int id;
    static int idgen = 1;

    List<Course> courses = new ArrayList<>();

    ///constructor
    Student(String firstName) {
        this.firstName = firstName;
        this.id = idgen;
        idgen++;
    }

    ///getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void ridCourse(int number) {
        courses.remove(number);
    }
    public void displaycourses() {
        for (Course block : courses){
            System.out.println(block.toString());
        }
    }
    public double getavg(){
        double total = 0;
        for (Course block : courses){
            total = total + block.getGrade();
        }
        return total/courses.size();
    }







}
