package action;

import com.opensymphony.xwork2.ModelDriven;
import entity.College;
import service.CollegeService;

import java.util.List;

public class CollegeAction extends SupperAction implements ModelDriven<College>{

    private College college = new College();
    @Override
    public College getModel() {
        return college;
    }

    private CollegeService collegeService;
    public void setCollegeService(CollegeService collegeService) {
        this.collegeService = collegeService;
    }

    public String selectCollege(){
        List<College> collegeList = collegeService.selectAll();
        request.setAttribute("collegeList",collegeList);
        return "selectCollege_success";
    }


    public String addCollege(){
        collegeService.addCollege(college);
        return "addCollege_success";
    }

    public String toUpdate(){
        college = collegeService.getOneById(college.getId());
        request.setAttribute("college",college);
        return "toUpdate_success";
    }

    public String updateCollege(){
        collegeService.updateOne(college);
        return "updateCollege_success";
    }

    public String deleteOne(){
        college = collegeService.getOneById(college.getId());
        if(college!=null){
            collegeService.delOne(college);
        }
        return "deleteOne_success";
    }
}
