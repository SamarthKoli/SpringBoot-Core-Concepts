package hibernateproject.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchContainer {
		public static void main(String[] args) {
			SessionFactory factory=new Configuration().configure().buildSessionFactory();
			Session session=factory.openSession();
			
			session.beginTransaction();
			
			
			Student student=session.get(Student.class, 103);
			
		if (student==null) {
			System.out.println("Data nahi hai bhai");
		}
		else {
			System.out.println(student);
		}
			
			
			
			session.close();
			factory.close();
			
			
		}
}
