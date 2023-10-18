package restaurant;

public class SubmitOrderCommand implements Command {
    private Aggregator aggregator;
    private int menuItemNumber;

    public SubmitOrderCommand(Aggregator aggregator, int menuItemNumber) {
        this.aggregator = aggregator;
        this.menuItemNumber = menuItemNumber;
    }

    @Override
    public String execute() {
        MenuItem menuItem = aggregator.getMenu().getMenuItem(menuItemNumber);
        aggregator.getOrders().addOrderItem(new OrderItem(menuItem));
        return " ";
    }
}