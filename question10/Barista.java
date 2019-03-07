package Questions.question10;

public abstract class Barista implements PendingOrderQueue{
    public String empid;

    public abstract void prepareCofee(String coffeetype);
    public abstract void addOrdertoCompleteQueue(Order order);
    public abstract void notifyToComplete();

}
