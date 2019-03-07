package Questions.question10;

public abstract class Customer {
    public String name;
    public int contact;
    public abstract void placeOrder(String coffeetype);
    public abstract void waitForCoffee();
    public abstract void collectCoffee();

}
