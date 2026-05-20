package gr.aueb.cf.ch10;

public class Student {
    private static int studentCount = 0;
    private int id;
    private String firstname;
    private String lastname;

    public Student() {
        studentCount++;

    }

    public Student(int id, String firstname, String lastname){
        studentCount++;
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

    public static int getStudentCount() {
        return studentCount;
    }
}
