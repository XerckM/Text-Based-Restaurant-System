package restaurant;

public class OrderItem {
    private MenuItem menuItem;

    public OrderItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    @Override
    public String toString() {
        return menuItem.toString();
    }
}
