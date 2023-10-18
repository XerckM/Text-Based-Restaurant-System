package restaurant;

public class Aggregator {
    private static Aggregator instance = null;
    private Menu menu;
    private Orders orders;
    private Tab tab;

    private Aggregator() {
        menu = new Menu();
        orders = new Orders();
        tab = new Tab(orders, menu);
        orders.addObserver(tab); // Register restaurant.Tab as an observer
    }

    // Singleton instance method
    public static Aggregator getInstance() {
        if (instance == null) {
            instance = new Aggregator();
        }
        return instance;
    }

    public Menu getMenu() {
        return menu;
    }

    public Orders getOrders() {
        return orders;
    }

    public Tab getTab() {
        return tab;
    }
}
