package service;

import dao.StudentDao;
import entity.Student;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional(readOnly = false)
public class StudentService {
    private StudentDao studentDao;
    public void setStudentDao(StudentDao studentDao){
        this.studentDao=studentDao;
    }
    public List<Student> selectAll(){
        return studentDao.selectAll();
    }

    public void addStudent(Student student) {
        studentDao.addOne(student);
    }

    public Student getOneByID(Integer id) {
        return studentDao.getOneById(id);
    }

    public void updateOne(Student student) {
        studentDao.updateOne(student);
    }

    public void delOne(Student student) {
        studentDao.delOne(student);
    }
}
