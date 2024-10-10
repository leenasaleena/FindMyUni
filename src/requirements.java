import java.util.Map;

public class requirements {
    private Map<String, Integer> documentList;  // Document name and number of copies required
    private boolean verificationNeeded;         // True if documents need verification (attested)
    private String deadline;

    public requirements(Map<String, Integer> documentList,
                        boolean verificationNeeded, String deadline) {
        this.documentList = documentList;
        this.verificationNeeded = verificationNeeded;
        this.deadline = deadline;
    }

    public Map<String, Integer> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(Map<String, Integer> documentList) {
        this.documentList = documentList;
    }

    public boolean isVerificationNeeded() {
        return verificationNeeded;
    }

    public void setVerificationNeeded(boolean verificationNeeded) {
        this.verificationNeeded = verificationNeeded;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
