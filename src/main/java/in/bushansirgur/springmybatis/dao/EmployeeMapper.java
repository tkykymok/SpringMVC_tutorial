package in.bushansirgur.springmybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import in.bushansirgur.springmybatis.entity.Employee;
import in.bushansirgur.springmybatis.util.MyBatisUtil;

@Repository
public class EmployeeMapper {

	public List<Employee> getAllEmployees() {
		
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Employee> employeeList = session.selectList("getAllEmployees"); 
		//EmployeeMapper.xml id="getAllEmployees"部分の記述を参照、Employeeオブジェクト生成
		session.commit();
		session.close();
		return employeeList;
		
	}

	public void saveEmployee(Employee employee) {
		
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertEmployee", employee);
		session.commit();
		session.close();
		
	}
	
	public void deleteEmployee(int employeeId) {
		
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.delete("deleteEmployee", employeeId);
		session.commit();
		session.close();
		
	}
	
	public Employee findById(int employeeId) {
		
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Employee employee = (Employee)session.selectOne("findById", employeeId);
		session.commit();
		session.close();
		return employee;
	}
	
	public Employee updateEmployee(Employee employee) {
		
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.update("updateEmployee", employee);
		session.commit();
		session.close();
		return employee;
		
	}
}
