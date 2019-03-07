package Questions.question3;

public class ThrowableExample {
    public String name="shivam";

    public void changeName(){
        System.out.println("hello world");
    }
}

class Main{
    public static void main(String[] args) {
        ThrowableExample throwableExample=new ThrowableExample();
        throwableExample.changeName();
    }
}
