package SpringCore.SpringJDBC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext ct =new ClassPathXmlApplicationContext("config.xml");
       StudentDAO d1=ct.getBean("studentimpl",StudentDAO.class);
       
//       Student s1=new Student();
//       s1.setId(101);
//       s1.setName("Samarth");
//       
//       int res=d1.addStudent(s1);
//       
       
      Student student= d1.getStudent(102);
       System.out.println(student);
//       System.out.println("rows affected:"+res);
    }
}
