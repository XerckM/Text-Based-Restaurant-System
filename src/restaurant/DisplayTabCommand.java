package restaurant;

public class DisplayTabCommand implements Command {
    private Aggregator aggregator;

    public DisplayTabCommand(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public String execute() {
        return aggregator.getTab().toString();
    }
}