package SpringCore.SpringAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ct=new ClassPathXmlApplicationContext("SpringCore/SpringAnnotation/config.xml");
        Emp emp1=ct.getBean("emp1",Emp.class);
        
        System.out.println(emp1.getAddress());
    }
}
