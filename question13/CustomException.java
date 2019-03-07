package Questions.question13;

import java.util.Scanner;

public class CustomException extends Exception{
    public CustomException(){
        System.out.println("age does not less than 1");
    }

    @Override
    public void printStackTrace() {

    }

}

class CheckException{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try {
            if (age > 1) {
                System.out.println("age is ok");
            } else{
                  throw new CustomException();
            }
            }catch(CustomException ex){
                ex.printStackTrace();
            }
        }
    }
