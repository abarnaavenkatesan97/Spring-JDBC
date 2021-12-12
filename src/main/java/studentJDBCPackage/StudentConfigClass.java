package studentJDBCPackage;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class StudentConfigClass {
	
	@Bean
	public Student studentBean()
	{
		Student student = new Student();
		student.setStudentid(4);
		student.setStudentname("Sindhu");
		student.setStudentdepartment("Civil");
		return student;
	}
	
	@Bean
	public DataSource datasource()
	{
		String url = "jdbc:mysql://localhost:3306/studentschema";
		String username = "root";
		String password = "Myroot@2114";
		DataSource datasource = new DriverManagerDataSource(url,username,password);
		return datasource;
	}
	
	@Bean
	 public JdbcTemplate jdbctemplate()
	{
		JdbcTemplate jdbctemplate = new JdbcTemplate(datasource());
		return jdbctemplate;
	}
	
	@Bean
	public StudentDAO studentdao()
	{
		StudentDAO studentdao = new StudentDAO();
		return studentdao;
	}

}
