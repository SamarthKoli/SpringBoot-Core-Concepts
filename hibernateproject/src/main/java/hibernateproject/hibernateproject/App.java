package hibernateproject.hibernateproject;

import java.io.File;
import java.io.FileInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
       System.out.println( "Hello World!" );
       SessionFactory factory=new Configuration().configure().buildSessionFactory();
       Student student=new Student();
       
//       student.setId(101);
//       student.setName("Samarth");
       FileInputStream fStream=new FileInputStream(new File("src/main/java/profilepic.jpeg"));
       byte[]data =fStream.readAllBytes();
       
       student.setId(102);
       student.setName("Atharva");
       student.setImage(data);
       System.out.println(student);
       
       Session session = factory.openSession();
       Transaction transaction = session.beginTransaction();


       session.save(student);
       transaction.commit();
       session.close();

       
       
       
       
    }
}
