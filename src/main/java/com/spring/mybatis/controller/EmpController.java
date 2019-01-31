package com.spring.mybatis.controller;

import com.spring.mybatis.condition.Condition;
import com.spring.mybatis.dao.EmpDao;
import com.spring.mybatis.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/emp")
@Transactional
public class EmpController {
    @Autowired
    private EmpDao empDao;

    @RequestMapping("/findAll")
    public String findAll(Model model ) {
        List<Emp> emps = empDao.findAll();
        model.addAttribute("emps", emps);
        System.out.println("查询员工数据，发送至列表页面");
        return "emp/emp_list";
    }

    // http://localhost:8080/emp/findAll02.do
    @RequestMapping(value = "/findAll02", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<Emp> findAll02() {
        List<Emp> emps = empDao.findAll();
//        model.addAttribute("emps", emps);
        System.out.println("查询员工数据，发送至列表页面");
        return emps;
    }

    @RequestMapping("/findBySalary")
    public String findBySalary(Model model, double salary){
        List<Emp> emps = empDao.findBySalary(salary);
        model.addAttribute("emps", emps);
        return "emp/emp_list";
    }

    @RequestMapping("/findEmpById")
    @ResponseBody
    public Emp findEmpById(int empno) {
        Emp emp = empDao.findEmpById(empno);
        return emp;
    }

    @RequestMapping("/findByDeptAndSalary")
    public String findByDeptAndSalary(Model model,int deptno, double salary){
        List<Emp> emps = empDao.findByDeptAndSalary(deptno, salary);
        model.addAttribute("emps", emps);
        return "emp/emp_list";
    }

    @RequestMapping(value = "/updateEmp", method = RequestMethod.POST)
    public void updateEmp(@RequestBody Emp emp) {
        empDao.updateEmp(emp);
    }

    @RequestMapping("/findByDeptAndSalary2")
    public String findByDeptAndSalary2(Model model,int deptno, double salary){
        List<Emp> emps = empDao.findByDeptAndSalary2(deptno, salary);
        model.addAttribute("emps", emps);
        return "emp/emp_list";
    }

    @RequestMapping("/updateEmp2")
    @ResponseBody
    public void updateEmp2(Emp emp) {
        empDao.updateEmp2(emp);
    }

    @RequestMapping("/findEmpByIds")
    public String findByIds(Model model, int[] ids) {
        List<Emp> emps = empDao.findEmpByIds(ids);
        model.addAttribute("emps", emps);
        return "emp/emp_list";
    }

    @RequestMapping(value = "/addEmp", method = RequestMethod.POST)
    @ResponseBody
    public void addEmp( Emp emp) {
        empDao.addEmp(emp);
    }

    @RequestMapping("/addBatch")
    public void addBatch() throws ClassNotFoundException {
        Emp emp = new Emp();
        emp.setEmpno(22);
        emp.setEname("tom");
        emp.setMgr(3);
        emp.setJob("clerk");
        emp.setSal(1000.0);
        emp.setHiredate(new Date());
        emp.setDeptno(20);
        emp.setComm(500.0);
        empDao.addEmp(emp);
        // 模拟异常
        // Integer.valueOf("abc");
        Class.forName("BadClass");
        Emp emp2 = new Emp();
        emp2.setEmpno(23);
        emp2.setEname("tony");
        emp2.setMgr(3);
        emp2.setJob("clerk");
        emp2.setSal(1200.0);
        emp2.setHiredate(new Date());
        emp2.setDeptno(20);
        emp2.setComm(500.0);
        empDao.addEmp(emp2);
    }


}
