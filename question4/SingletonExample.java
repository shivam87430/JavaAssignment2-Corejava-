package Questions.question4;

class SingletonExample {
    private static SingletonExample single_instance = null;

    public String x;


    private SingletonExample() {
        x = "Hello This is Singleton String";
    }

    public static SingletonExample getInstance() {
        if (single_instance == null) {
            single_instance = new SingletonExample();
        }
        return single_instance;
    }
}

class Main{
    public static void main(String[] args) {
        SingletonExample singletonExample=SingletonExample.getInstance();
        SingletonExample singletonExample1=SingletonExample.getInstance();
        SingletonExample singletonExample2=SingletonExample.getInstance();
        singletonExample.x=(singletonExample.x).toUpperCase();

        System.out.println(singletonExample.x);
        System.out.println(singletonExample1.x);
        System.out.println(singletonExample2.x);


        System.out.println("\n");
        singletonExample1.x=(singletonExample1.x).toLowerCase();
        System.out.println(singletonExample.x);
        System.out.println(singletonExample1.x);
        System.out.println(singletonExample2.x);


    }
}
