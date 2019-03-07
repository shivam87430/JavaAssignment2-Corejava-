package Questions.question1;

abstract class Library {
    String lib_name;
    String lib_address;
    public Library(){
        lib_name="Global Library";
        lib_address="Sector 127 Noida";
    }

    public abstract void getLibraryInfo();
}
