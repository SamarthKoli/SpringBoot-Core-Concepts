package SpringCore.SpringJDBC;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDAOImpl  implements StudentDAO{

	private JdbcTemplate template;
	@Override
	public int addStudent(Student student) {
		return this.template.update("insert into student(id,name)values(?,?)",student.getId(),student.getName());
	}

	@Override
	public int deleteStudent(Student student) {
		return this.template.update("delete from student where id=?",student.getId());
		
		
	}

	@Override
	public int updateStudent(Student student) {
		return this.template.update("update into student set name=? where id=?",student.getId(),student.getName());
		
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		RowMapper<Student>rowMapper=new rowMapper();
		String queryString="select * from student where id=?";
		Student student= this.template.queryForObject(queryString,rowMapper,id);
		return student;
	}

	

}
