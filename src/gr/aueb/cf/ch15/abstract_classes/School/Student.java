package gr.aueb.cf.ch15.abstract_classes.School;

public class Student extends AbstractActor{
    private String region;

    public Student(){

    }

    public Student(int id, String firstname, String lastname, String region) {
        super(id, firstname, lastname);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
