import java.util.ArrayList;
import java.util.List;

public class Lecturer extends Employee {
    private List<Course> courses;

    public Lecturer() {
        this.courses = new ArrayList<>();
    }

    public List<Course> getCourses() { return courses; }
    public void setCourses(List<Course> courses) { this.courses = courses; }
}