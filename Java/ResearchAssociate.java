import java.util.ArrayList;
import java.util.List;

public class ResearchAssociate extends Employee {
    private String fieldOfStudy;
    private List<Participation> participations;

    public ResearchAssociate() {
        this.participations = new ArrayList<>();
    }

    public String getFieldOfStudy() { return fieldOfStudy; }
    public void setFieldOfStudy(String fieldOfStudy) { this.fieldOfStudy = fieldOfStudy; }

    public List<Participation> getParticipations() { return participations; }
    public void setParticipations(List<Participation> participations) { this.participations = participations; }
}