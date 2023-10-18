package restaurant;

public class MenuItem {
    private int itemNumber;
    private String description;
    private double cost;

    public MenuItem(int itemNumber, String description, double cost) {
        this.itemNumber = itemNumber;
        this.description = description;
        this.cost = cost;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return itemNumber + ": " + description + " - $" + cost;
    }
}