public class meritCriteria {
    private String sscMarks;
    private String hsscMarks;
    private double entryTestScore;
    private double boardPercentage;

    //constructor

    public meritCriteria(String sscMarks, String hsscMarks,
                         double entryTestScore, double boardPercentage) {
            this.sscMarks = sscMarks;
            this.hsscMarks = hsscMarks;
            this.entryTestScore = entryTestScore;
            this.boardPercentage = boardPercentage;
    }

    public String getSscMarks() {
        return sscMarks;
    }

    public void setSscMarks(String sscMarks) {
        this.sscMarks = sscMarks;
    }

    public String getHsscMarks() {
        return hsscMarks;
    }

    public void setHsscMarks(String hsscMarks) {
        this.hsscMarks = hsscMarks;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(double entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    public double getBoardPercentage() {
        return boardPercentage;
    }

    public void setBoardPercentage(double boardPercentage) {
        this.boardPercentage = boardPercentage;
    }
}
