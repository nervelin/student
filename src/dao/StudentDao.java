package dao;

import entity.Student;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class StudentDao extends HibernateDaoSupport{
    public List<Student> selectAll;

    //查询
    public List<Student> selectAll(){
        String hql="from Student";
        List<Student> list=(List<Student>) this.getHibernateTemplate().find(hql);
        return  list;
    }

    public void addOne(Student student) {
        this.getHibernateTemplate().save(student);
    }

    public Student getOneById(Integer id) {
        String hql="from Student where id=?";
        List<Student> list=(List<Student>) this.getHibernateTemplate().find(hql,id);
        if (list.size()>0){
            return list.get(0);
        }
        return null;
    }

    public void updateOne(Student student) {
        this.getHibernateTemplate().update(student);
    }

    public void delOne(Student student) {
        this.getHibernateTemplate().delete(student);
    }
}
