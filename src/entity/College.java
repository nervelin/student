package entity;

import java.util.Set;

public class College {

    private Integer id;
    private String collegename;
    private String describes;
    private Set<Student> students;

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getCollegename() {
        return collegename;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }
}
