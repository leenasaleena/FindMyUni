import java.util.List;

public class courses {
    private String courseName;
    private String courseCode;
    private int credits;
    private List<String> prerequisites;  // List of prerequisite courses

    public courses(String courseName, String courseCode,
                   int credits, List<String> prerequisites) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public List<String> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(List<String> prerequisites) {
        this.prerequisites = prerequisites;
    }
}
