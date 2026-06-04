package org.snad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class StudentRepository {
	@Autowired
	Student student;
	
	public void saveStudent() {//database logic
        System.out.println("Saving Student");
        System.out.println(student);
    }

}
