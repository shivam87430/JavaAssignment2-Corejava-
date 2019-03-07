package Questions.question10;

public abstract class Cashier {
    public String name;
    public String empid;

    public abstract void takeOrder(Order order,int Cash);
    public abstract void placeOrderToQueue();

}
