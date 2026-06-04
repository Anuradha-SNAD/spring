package org.snad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	//business logic
	public void registerStudent() {
        System.out.println("Validating Student");
        System.out.println("Checking Marks");
        studentRepository.saveStudent();
    }

}
