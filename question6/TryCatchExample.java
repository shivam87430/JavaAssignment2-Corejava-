package Questions.question6;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            String[] str=new String[3];
            System.out.println(a);
            System.out.println(str[4]);
        } catch (ArithmeticException ae) {
            System.out.println("this is Arithmetic Exception : "+ae);
        } catch(ArrayIndexOutOfBoundsException aiob){
            System.out.println("this is Array Index Out of bound Exception : "+aiob);
        }
        finally {
            System.out.println("this is finally block");
        }
    }




}
