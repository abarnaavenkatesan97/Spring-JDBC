package studentJDBCPackage;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbctemplate;

	public void insert(Student student)
	{
		String query = "INSERT INTO STUDENT VALUES(?,?,?)";
		Object[] arg = {student.getStudentid(),student.getStudentname(),student.getStudentdepartment()};
		System.out.println("No.of rows affected:" + jdbctemplate.update(query, arg));
				
	}
	
	public void findallstudents()
	{
		String selectquery = "SELECT * FROM STUDENT";
		RowMapper<Student> rowmapperobj = new StudentRowMapper();
		List<Student> studentlist= jdbctemplate.query(selectquery, rowmapperobj);
		for(Student eachstud : studentlist)
		{
			System.out.println("Id : " + eachstud.getStudentid());
			System.out.println("Name : " + eachstud.getStudentname());
			System.out.println("Department : " + eachstud.getStudentdepartment());
			System.out.println("-----------------");
		}
	}

}
