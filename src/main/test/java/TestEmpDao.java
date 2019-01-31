import com.spring.mybatis.controller.EmpController;
import com.spring.mybatis.dao.EmpDao;
import com.spring.mybatis.entity.Emp;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class TestEmpDao {

    @Test
    public void testFindAll() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = ac.getBean("empDao", EmpDao.class);
        List<Emp> emps = empDao.findAll();
        System.out.println(emps);
    }

    @Test
    public void testAddEmp() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = ac.getBean("empDao", EmpDao.class);
        Emp emp = new Emp();
        //emp.setEmpno(13);
        emp.setEname("tom");
        emp.setMgr(3);
        emp.setJob("clerk");
        emp.setSal(1000.0);
        emp.setHiredate(new Date());
        emp.setDeptno(20);
        emp.setComm(500.0);
        empDao.addEmp(emp);
    }

    @Test
    public void findById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = ac.getBean("empDao", EmpDao.class);
        Emp emp = empDao.findById(1);
        System.out.println(emp.getEmpno() + " " + emp.getEname() + " " + emp.getJob() + " "
               + emp.getDept().getDeptno() + " " + emp.getDept().getDname() );
    }

    @Test
    public void findById2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = ac.getBean("empDao", EmpDao.class);
        Emp emp = empDao.findById2(1);
        System.out.println(emp.getEmpno() + " " + emp.getEname() + " " + emp.getJob() + " "
                + emp.getDept().getDeptno() + " " + emp.getDept().getDname() );
    }

    @Test
    public void testAddManyEmps() throws ClassNotFoundException{
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpController empController = ac.getBean("empController", EmpController.class);
        empController.addBatch();

    }
}
