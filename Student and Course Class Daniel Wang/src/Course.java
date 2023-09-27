public class Course {
    private String courses;
    private int grade;

    public Course(String courses, int grade) {
        this.courses = courses;
        this.grade = grade;
    }
    ///getter and setters
    @Override
    public String toString() {
        return courses;
    }
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}

