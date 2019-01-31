import com.spring.mybatis.dao.DeptDao;
import com.spring.mybatis.dao.VehicleDao;
import com.spring.mybatis.entity.Dept;
import com.spring.mybatis.entity.Emp;
import com.spring.mybatis.entity.Vehicle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestVehicleDao {
    @Test
    public void TestfindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        VehicleDao vehicleDao = ac.getBean("vehicleDao", VehicleDao.class);
        List<Vehicle> vehicles = vehicleDao.findAll();
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }


}
