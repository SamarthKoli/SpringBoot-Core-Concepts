package SpringCore.MySpringRevision;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        
        
       ClassPathXmlApplicationContext ct=new ClassPathXmlApplicationContext("config.xml");
       
//       Student s1=(Student) ct.getBean("s1");
//       
//      System.out.println(s1.getId());
//      System.out.println(s1.getName());
//;     System.out.println(s1.getCourse());

       	Person p1=(Person)ct.getBean("p1");
       	Person name=p1;
       	
       	System.out.print(name.toString());

       
    }
}
