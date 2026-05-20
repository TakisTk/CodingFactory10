package gr.aueb.cf.ch10;

public class Student {
    private int id;
    private String firstname;
    private String lastname;

    public Student() {
        id = 0;
        firstname = null;
        lastname = null;
    }

    public Student(int id, String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }



    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
