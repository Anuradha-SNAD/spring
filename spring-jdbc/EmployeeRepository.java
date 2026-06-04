package org.snad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void save(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getSalary());
		System.out.println("Employee Inserted...");
	}
	
	public void delete(int id) {
		String sql = "delete from employee where id = ?";
		jdbcTemplate.update(sql,id);
		System.out.println("Employee Deleted...");
	}
	
	public void update(int id,double salary) {
		String sql ="update employee set salary = ? where id = ?";
		jdbcTemplate.update(sql,salary,id);
		System.out.println("Salary Updated...");
	}
	public Employee fetch(int id) {
		String s = "select * from employee where id = ?";
		return jdbcTemplate.queryForObject(s, new BeanPropertyRowMapper<>(Employee.class),id);
		
	}
	public List<Employee> fetchAll() {
	    String sql = "select * from employee";
	    return jdbcTemplate.query(sql,
	            new BeanPropertyRowMapper<>(Employee.class));
	}

}
