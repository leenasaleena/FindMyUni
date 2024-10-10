import java.util.List;

public class programs {
    private int programId;
    private String programName;
    private int duration;  // Duration in years
    private double fees;
    private List<courses> courses;  // Each program has a list of courses to be studies throughout the degree
    private List<requirements> admissionRequirements;  //  Each program has admission requirements
    private List<scholarships> scholarship;  //  List of scholarships available for this program

    // Constructor

    public programs(int programId, String programName, int duration,
                    double fees, List<courses> courses,
                    List<requirements> admissionRequirements,
                    List<scholarships> scholarship) {

            this.programId = programId;
            this.programName = programName;
            this.duration = duration;
            this.fees = fees;
            this.courses = courses;
            this.admissionRequirements = admissionRequirements;
            this.scholarship = scholarship;
    }


    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public List<requirements> getAdmissionRequirements() {
        return admissionRequirements;
    }

    public void setAdmissionRequirements(List<requirements> admissionRequirements) {
        this.admissionRequirements = admissionRequirements;
    }

    public List<courses> getCourses() {
        return courses;
    }

    public void setCourses(List<courses> courses) {
        this.courses = courses;
    }

    public List<scholarships> getScholarship() {
        return scholarship;
    }

    public void setScholarship(List<scholarships> scholarship) {
        this.scholarship = scholarship;
    }
}
