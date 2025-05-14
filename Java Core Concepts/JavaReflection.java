import java.lang.reflect.Field;

class Company{
   private String name;
    public Company(String name){this.name=name;}
    public String getName(){return name;}

    private void displayName(){
        System.out.println("Private method name "+name);
    }

    

}

public class JavaReflection {


    //Using reflection to set a private field CompanyName and invoke private method displayCpmpany()
    //Using Reflection we can able to change accessibilty and behaivor of methods and members of class
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
       Company company=new Company("Google");

       System.out.println( company.getName());
      //Using Field Class from reflect package 
      Field field=  Company.class.getDeclaredField("name");
      //Setting visiblity of field to be modified 
      field.setAccessible(true);
      //Setting new values to private variable by passing object and value to be set
      field.set(company, "Youtube");
      System.out.println( company.getName());
      

    }
}