package service;

import dao.CollegeDao;
import entity.College;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false)
public class CollegeService {

    private CollegeDao collegeDao;
    public void setCollegeDao(CollegeDao collegeDao) {
        this.collegeDao = collegeDao;
    }

    public List<College> selectAll() {
        return collegeDao.selectAll();
    }

    public void addCollege(College college) {
        collegeDao.addOne(college);
    }

    public College getOneById(Integer id) {
        return collegeDao.getOneById(id);
    }

    public void updateOne(College college) {
        collegeDao.updateOne(college);
    }

    public void delOne(College college) {
        collegeDao.delOne(college);
    }
}
