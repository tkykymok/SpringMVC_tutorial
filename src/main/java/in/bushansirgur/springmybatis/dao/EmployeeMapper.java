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

}
