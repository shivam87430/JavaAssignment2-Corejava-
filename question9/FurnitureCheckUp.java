package Questions.question9;

import java.util.Scanner;

public class FurnitureCheckUp extends furniture {
    private int stress;
    private int fire;

    public static void main(String[] args) {
        furniture f = new FurnitureCheckUp();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter wooden chair name you want to buy");
        String wchairname=sc.next();
        System.out.println("Enter wooden Table name you want to buy");
        String wtablename=sc.next();
        f.wooden(wchairname,wtablename);


        System.out.println("Enter Metal chair name you want to buy");
        String mchairname=sc.next();
        System.out.println("Enter Metal Table name you want to buy");
        String mtablename=sc.next();
        f.Metal(mchairname ,mtablename);


        System.out.println("Enter the value to check stress of wooden item");
        int wstress=sc.nextInt();
        f.stressForWoodenItems(wstress);
        System.out.println("Enter the value to check Fire of wooden item");
        int wfire=sc.nextInt();
        f.fireForWoodenItems(wfire);
        System.out.println("Enter the value to check stress of Metal item");
        int mstress=sc.nextInt();
        f.stressForMetalItems(mstress);
        System.out.println("Enter the value to check Fire of Metal item");
        int mfire= sc.nextInt();
        f.fireForMetalItems(mfire);

    }

    @Override
    public void stressForWoodenItems(int stress) {
        if (stress < 500) {
            System.out.println("wooden furniture handles stress");
        } else {
            System.out.println("Wooden furniture does not handle stress");
        }
    }

    @Override
    public void fireForWoodenItems(int fire) {
        if (fire > 20) {
            System.out.println("fire can be handled by wooden items");

        }else{
            System.out.println("fire can not handled by wooden items");
        }
    }

    @Override
    public void fireForMetalItems(int fire) {
        if (fire > 100) {
            System.out.println("fire can be handled by Metal items");

        }else{
            System.out.println("fire can not handled by Metal items");
        }
    }

    @Override
    public void stressForMetalItems(int stress) {
        if (stress < 1000) {
            System.out.println("Metal furniture handles stress");
        } else {
            System.out.println("Metal furniture does not handle stress");
        }
    }
}
