package restaurant;

public class Invoker {
    private Aggregator aggregator;

    public Invoker(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    public String displayMenu() {
        return new DisplayMenuCommand(aggregator).execute();
    }

    public String submitOrder(int menuItemNumber) {
        return new SubmitOrderCommand(aggregator, menuItemNumber).execute();
    }

    public String displayTab() {
        return new DisplayTabCommand(aggregator).execute();
    }
}