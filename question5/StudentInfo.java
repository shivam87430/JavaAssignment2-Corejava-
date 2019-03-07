package Questions.question5;

public class StudentInfo implements Cloneable {
    private String name;
    private int age;

    public StudentInfo(String n,int a){
        this.name=n;
        this.age=a;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            StudentInfo studentInfo=new StudentInfo("Shivam",19);
            StudentInfo studentInfo1=(StudentInfo)studentInfo.clone();
            System.out.println(studentInfo.name +" And Age is "+studentInfo.age);
            System.out.println(studentInfo1.name+" And Age is "+studentInfo1.age);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
