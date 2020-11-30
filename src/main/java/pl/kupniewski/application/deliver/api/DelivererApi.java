package pl.kupniewski.application.deliver;

public class DelivererApi {

    public OrderReadyToDeliver deliverOrderToCustomer(OrderReadyToDeliver orderToDeliver) {
        return new OrderReadyToDeliver("Order has been delivered", orderToDeliver.getOrder());
    }
}
