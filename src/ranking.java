public class ranking {
    private String universityName;
    private String rankingAuthority;
    private int rankingYear;
    private int rankingPosition;
    private String rankingCategory;

    // constructor
    public ranking(String universityName, String rankingAuthority,
                   int rankingYear, int rankingPosition, String rankingCategory) {
        this.universityName = universityName;
        this.rankingAuthority = rankingAuthority;
        this.rankingYear = rankingYear;
        this.rankingPosition = rankingPosition;
        this.rankingCategory = rankingCategory;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getRankingAuthority() {
        return rankingAuthority;
    }

    public void setRankingAuthority(String rankingAuthority) {
        this.rankingAuthority = rankingAuthority;
    }

    public int getRankingYear() {
        return rankingYear;
    }

    public void setRankingYear(int rankingYear) {
        this.rankingYear = rankingYear;
    }

    public int getRankingPosition() {
        return rankingPosition;
    }

    public void setRankingPosition(int rankingPosition) {
        this.rankingPosition = rankingPosition;
    }

    public String getRankingCategory() {
        return rankingCategory;
    }

    public void setRankingCategory(String rankingCategory) {
        this.rankingCategory = rankingCategory;
    }
}
