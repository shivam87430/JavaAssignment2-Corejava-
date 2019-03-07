package Questions.question10;

public interface PendingOrderQueue {
    void addOrder(Order o);
    void getNextOrder(Order o);
}
