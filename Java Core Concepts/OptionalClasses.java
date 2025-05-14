import java.util.Optional;

public class OptionalClasses {


    //optional class is container in which it helps us to handle null vlaues 
    public Optional< String> findUserById(int id){
        if (id==0) {
            return Optional.empty();
        }
        else{
            return Optional.ofNullable("Samarth");
        }
    }

    public static void main(String[] args) {
        OptionalClasses userDatabase=new OptionalClasses();

        Optional<String>userName=userDatabase.findUserById(0);
        
        userName.ifPresentOrElse(
            //If data is valid then handle using this statement of lambda expression
            uname->System.out.println(uname)
            //Else execute this emptyaction to handle null values 
        , ()->System.out.println("User not found")
        );
    }
    
}
