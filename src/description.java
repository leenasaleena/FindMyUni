import java.util.List;

public class description {
    private String universityName;
    private location location;
    private int establishedYear;
    private uniType type;
    private String accreditation;
    private List<programs> programsOffered;
    private String facilities; // Description of facilities
    private String website;
    private String contactInformation;

    // constructor

    public description(String universityName, location location,
                       int establishedYear, uniType type, String accreditation,
                       List<programs> programsOffered,
                       String contactInformation, String website, String facilities) {
        this.universityName = universityName;
        this.location = location;
        this.establishedYear = establishedYear;
        this.type = type;
        this.accreditation = accreditation;
        this.programsOffered = programsOffered;
        this.contactInformation = contactInformation;
        this.website = website;
        this.facilities = facilities;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public location getLocation() {
        return location;
    }

    public void setLocation(location location) {
        this.location = location;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public uniType getType() {
        return type;
    }

    public void setType(uniType type) {
        this.type = type;
    }

    public String getAccreditation() {
        return accreditation;
    }

    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }

    public List<programs> getProgramsOffered() {
        return programsOffered;
    }

    public void setProgramsOffered(List<programs> programsOffered) {
        this.programsOffered = programsOffered;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
}
