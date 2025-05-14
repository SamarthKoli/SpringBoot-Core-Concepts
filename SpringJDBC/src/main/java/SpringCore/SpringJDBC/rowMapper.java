package SpringCore.SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class rowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s1=new Student();
		s1.setId(rs.getInt(1));
		s1.setName(rs.getString(2));
		
		return s1;
	}	
	
}
