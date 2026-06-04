package org.snad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;
	
	public void addEmployee(Employee emp) {
		repository.save(emp);
	}
	public void removeEmployee(int id) {
        repository.delete(id);
    }

    public void updateEmployeeSalary(int id,double salary) {
    	repository.update(id, salary);
    }
    
    public Employee fetch(int id) {
    	return repository.fetch(id);
    }
    public List<Employee> fetchAll() {
        return repository.fetchAll();
    }
}
