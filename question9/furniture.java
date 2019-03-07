package Questions.question9;

abstract class furniture {
    private String wchairname;
    private String wtablename;
    private String mchairname;
    private String mtablename;

   public void wooden(String chairname,String tablename){
        this.wchairname=chairname;
        this.wtablename=tablename;
       System.out.println("Wooden chair is : "+wchairname+ " Wooden Table is : "+wtablename);
   }
   public void Metal(String Chairname,String tablename){
        this.mchairname=Chairname;
        this.mtablename=tablename;
       System.out.println("Metal chair is : "+mchairname+ " Metal Table is : "+mtablename);
   }

    public abstract void stressForWoodenItems(int stress);
    public abstract void fireForWoodenItems(int fire);
    public abstract void fireForMetalItems(int fire);
    public abstract void stressForMetalItems(int stress);


}
