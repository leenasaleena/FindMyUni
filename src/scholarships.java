import java.time.LocalDate;

public class scholarships {
    private int scholarshipId;
    private String scholarshipName;
    private ScholarshipType scholarshipType;  // Enum for type of scholarship
    private double amount;
    private boolean isPercentage;
    private meritCriteria eligibilityCriteria;
    private LocalDate applicationDeadline;

    public scholarships(int scholarshipId, String scholarshipName, double amount,
                        meritCriteria eligibilityCriteria, LocalDate applicationDeadline) {

            this.scholarshipId = scholarshipId;
            this.scholarshipName = scholarshipName;
            this.amount = amount;
            this.eligibilityCriteria = eligibilityCriteria;
            this.applicationDeadline = applicationDeadline;
    }


    public int getScholarshipId() {
        return scholarshipId;
    }

    public void setScholarshipId(int scholarshipId) {
        this.scholarshipId = scholarshipId;
    }

    public String getScholarshipName() {
        return scholarshipName;
    }

    public void setScholarshipName(String scholarshipName) {
        this.scholarshipName = scholarshipName;
    }

    public ScholarshipType getScholarshipType() {
        return scholarshipType;
    }

    public void setScholarshipType(ScholarshipType scholarshipType) {
        this.scholarshipType = scholarshipType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public meritCriteria getEligibilityCriteria() {
        return eligibilityCriteria;
    }

    public void setEligibilityCriteria(meritCriteria eligibilityCriteria) {
        this.eligibilityCriteria = eligibilityCriteria;
    }

    public LocalDate getApplicationDeadline() {
        return applicationDeadline;
    }

    public void setApplicationDeadline(LocalDate applicationDeadline) {
        this.applicationDeadline = applicationDeadline;
    }

    public boolean isPercentage() {
        return isPercentage;
    }

    public void setPercentage(boolean percentage) {
        isPercentage = percentage;
    }
}
