package gr.aueb.cf.ch15.abstract_classes.School;

public class Teacher extends AbstractActor{
    private String subject;

    public Teacher() {

    }

    public Teacher(int id, String firstname, String lastname, String region) {
        super(id, firstname, lastname);
        this.subject = region;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
