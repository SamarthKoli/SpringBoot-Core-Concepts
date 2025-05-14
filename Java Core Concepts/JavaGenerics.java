class GenericBox<T>{
    private T item;

    public void setItem(T item){this.item=item;}

    public T getItem(){return item;}

    
}




public class JavaGenerics {

    // Generics allows us to cast the classes during compile time and it also avoid explit type casting of class and objets
    public static void main(String[] args) {
        GenericBox<Integer>genericBox=new GenericBox<>();
        genericBox.setItem(10);
        System.out.println(genericBox.getItem());

        GenericBox<String>genericBox2=new GenericBox<>();
        genericBox2.setItem("Samarth");
        System.out.println(genericBox2.getItem());


    }
}
