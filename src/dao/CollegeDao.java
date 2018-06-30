package dao;

import entity.College;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class CollegeDao extends HibernateDaoSupport{

    //查询
    public List<College> selectAll() {
        String hql ="from College";
        List<College> list = (List<College>) this.getHibernateTemplate().find(hql);
        return list;
    }

    public void addOne(College college) {
        this.getHibernateTemplate().save(college);
    }

    public College getOneById(Integer id) {
        String hql ="from College where id=?";
        List<College> list = (List<College>) this.getHibernateTemplate().find(hql,id);
        if (list.size()>0){
            return list.get(0);
        }
        return null;
    }

    public void updateOne(College college) {
        this.getHibernateTemplate().update(college);
    }

    public void delOne(College college) {
        this.getHibernateTemplate().delete(college);
    }
}
