package action;

import com.opensymphony.xwork2.ModelDriven;
import entity.Student;
import service.StudentService;

import java.util.List;

public class StudentAction extends SupperAction implements ModelDriven<Student> {
    private Student student=new Student();
    @Override
    public Student getModel() {
        return student;
    }
    private StudentService studentService;
    public void setStudentService(StudentService studentService){
        this.studentService=studentService;
    }

    public  String selectStudent(){
        List<Student> studentList=studentService.selectAll();
        request.setAttribute("studentList",studentList);
        return "selectStudent_success";
    }

    public String addStudent(){
        studentService.addStudent(student);
        return "addStudent_success";
    }

    public String toUpdate(){
        student = studentService.getOneByID(student.getId());
        request.setAttribute("student",student);
        return "toUpdate_success";
    }

    public String updateStudent(){
        studentService.updateOne(student);
        return "updateStudent_success";
    }

    public String deleteOne(){
        student = studentService.getOneByID(student.getId());
        if (student!=null){
            studentService.delOne(student);
        }
        return "deleteOne_success";
    }
}
