import com.spring.mybatis.dao.DeptDao;
import com.spring.mybatis.dao.EmpDao;
import com.spring.mybatis.entity.Dept;
import com.spring.mybatis.entity.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestDeptDao {
    @Test
    public void TestfindDeptById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptDao deptDao = ac.getBean("deptDao", DeptDao.class);
        Dept dept = deptDao.findDeptById(30);
        System.out.println(dept.getDeptno() + " " + dept.getDname() + " " + dept.getLoc());
        List<Emp> emps =  dept.getEmps();
        for (Emp emp : emps) {
            System.out.println(emp.getEmpno() + " " + emp.getEname() + " " + emp.getJob());
        }
    }

    @Test
    public void TestfindDeptById2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptDao deptDao = ac.getBean("deptDao", DeptDao.class);
        Dept dept = deptDao.findDeptById2(30);
        System.out.println(dept.getDeptno() + " " + dept.getDname() + " " + dept.getLoc());
        List<Emp> emps =  dept.getEmps();
        for (Emp emp : emps) {
            System.out.println(emp.getEmpno() + " " + emp.getEname() + " " + emp.getJob());
        }
    }
}
