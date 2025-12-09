import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Dean dean;
    private List<Institute> institutes;

    public Faculty() {
        this.institutes = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Dean getDean() { return dean; }
    public void setDean(Dean dean) { this.dean = dean; }

    public List<Institute> getInstitutes() { return institutes; }
    public void setInstitutes(List<Institute> institutes) { this.institutes = institutes; }
}