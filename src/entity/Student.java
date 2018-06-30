package entity;

public class Student {
    private Integer id;//属性私有
    private String studentname;
    private String sex;
    private String major;
    private String phone;
    private College college;

    public void setId(Integer id) {
        this.id = id;
    }//set和get方法,jinxing封装

    public Integer getId() {
        return id;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public College getCollege() {
        return college;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
}
