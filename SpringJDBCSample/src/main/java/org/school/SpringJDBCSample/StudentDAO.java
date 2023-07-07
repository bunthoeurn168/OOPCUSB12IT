package org.school.SpringJDBCSample;

import java.util.List;

public interface StudentDAO {
	Student getStudentById(Long id);
	List<Student> getAllStudent();
	boolean deleteStudent(Student student);
	boolean updateStudent(Student student);
	boolean createStudent(Student student);
}
