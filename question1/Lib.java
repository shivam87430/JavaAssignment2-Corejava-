package Questions.question1;

import java.util.Calendar;
import java.util.Date;

public class Lib extends Library implements LibraryPro {
    String member_name;
    int member_contact;
    String member_book;
    Date issue_date;
    Date return_date;

    public Lib(String mem_name,int mem_con,String mem_book){
        this.member_name=mem_name;
        this.member_contact=mem_con;
        this.member_book=mem_book;
    }

    @Override
    public void getLibraryInfo() {
        System.out.println("Library name is : "+lib_name);
        System.out.println("Library Address is : "+lib_address);
        System.out.println("Library Seat Capacity : "+lib_seat_cap);
    }

    @Override
    public void issueBook() {
        Date d=new Date();
        issue_date=d;
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DATE,7);
        return_date=calendar.getTime();
        System.out.println("succesfully Book issued to "+member_name+" on date "+issue_date.toString()+" and return on "+return_date);
    }

    @Override
    public void returnBook() {
        if(issue_date==null && return_date==null){
            System.out.println("No book has been issued");
        }else{
            issue_date=null;
            return_date=null;
            System.out.println("book has been returned successfully");
        }
    }

    public void getMemberDetails(){
        if(issue_date==null && return_date==null){
            System.out.println("Member Name : "+member_name);
            System.out.println("Member Contact : "+member_contact);
            System.out.println("Member book : "+member_book);
            System.out.println("Now No Book has been issued to the "+member_name);
        }else{
            System.out.println("Member Name : "+member_name);
            System.out.println("Member Contact : "+member_contact);
            System.out.println("Member book : "+member_book);
            System.out.println("Issue Date : "+issue_date);
            System.out.println("return Date  : "+return_date);
        }
    }
}

class Main{
    public static void main(String[] args) {
        Lib lib=new Lib("Shivam",84545414,"Daa");
        Lib lib1=new Lib("satyam",5545541,"Physics");
        lib.getLibraryInfo();
        lib.issueBook();
        lib.returnBook();
        lib.getMemberDetails();
        lib1.issueBook();
        lib1.returnBook();
        lib1.getMemberDetails();
    }
}