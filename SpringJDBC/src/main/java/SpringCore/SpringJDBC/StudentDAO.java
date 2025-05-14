package SpringCore.SpringJDBC;

public interface StudentDAO {

	
	public int addStudent(Student student);
	public int deleteStudent(Student student);
	public int updateStudent(Student student);
	public Student getStudent(int id);
	
}
