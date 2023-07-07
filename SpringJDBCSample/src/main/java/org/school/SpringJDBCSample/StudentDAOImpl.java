package org.school.SpringJDBCSample;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDAOImpl {
	JdbcTemplate jdbcTemplate;
	private final String SQL_FIND_Student = "select * from students where id = ?";
	private final String SQL_DELETE_Student = "delete from students where id = ?";
	private final String SQL_UPDATE_Student = "update students set name = ?, age = ? where id = ?";
	private final String SQL_GET_ALL = "select * from students";
	private final String SQL_INSERT_Student = "insert into students(name, age) values(?, ?)"; 
	
	@Autowired
	public StudentDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	public Student getStudentById(Long id) {
		return jdbcTemplate.queryForObject(SQL_FIND_Student, new Object[] {id}, new StudentMapper());
	}
	
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudent() {
		return jdbcTemplate.query(SQL_GET_ALL, new StudentMapper());
	}

	public boolean deleteStudent(Student student) {
		return jdbcTemplate.update(SQL_DELETE_Student, student.getId()) > 0;
	}

	public boolean updateStudent(Student student) {
		return jdbcTemplate.update(SQL_UPDATE_Student, student.getName(), student.getAge(), student.getId()) > 0;
	}

	public boolean createStudent(Student student) {
		return jdbcTemplate.update(SQL_INSERT_Student, student.getName(), student.getAge()) > 0;
	}
	
}



















