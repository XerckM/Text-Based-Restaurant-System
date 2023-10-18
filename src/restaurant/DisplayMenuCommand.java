package restaurant;

public class DisplayMenuCommand implements Command {
    private Aggregator aggregator;

    public DisplayMenuCommand(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public String execute() {
        return aggregator.getMenu().toString();
    }
}