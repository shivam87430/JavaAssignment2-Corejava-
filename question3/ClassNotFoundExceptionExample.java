package Questions.question3;

public class ClassNotFoundExceptionExample {
    private static final String Class_to_load="main.java.Utils";
    public static void main(String[] args) {
        try{
            Class loadedClass=Class.forName(Class_to_load);
            System.out.println("Class" + loadedClass +"founded successfully");
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }
    }
}
