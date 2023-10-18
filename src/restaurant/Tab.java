package restaurant;

public class Tab implements OrdersObserver {
    private final Orders orders;
    private final Menu menu;

    public Tab(Orders orders, Menu menu) {
        this.orders = orders;
        this.menu = menu;
    }

    @Override
    public void update(OrderItem orderItem) {
        System.out.println("New order added: " + orderItem);
        System.out.println("Updated " + this);
    }

    @Override
    public String toString() {
        StringBuilder tabString = new StringBuilder("restaurant.Tab:\n");
        double total = 0.0;
        for (OrderItem orderItem : orders.getOrderItems()) {
            double cost = orderItem.getMenuItem().getCost();
            total += cost;
            tabString.append(orderItem).append("\n");
        }
        tabString.append("Total: $").append(total).append("\n");
        return tabString.toString();
    }
}
