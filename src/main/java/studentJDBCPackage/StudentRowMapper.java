package studentJDBCPackage;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student studobj = new Student();
		studobj.setStudentid(rs.getInt("studentid")); 
		studobj.setStudentname(rs.getString("studentname"));
		studobj.setStudentdepartment(rs.getString("studentdepartment"));
		return studobj;
	}

}
