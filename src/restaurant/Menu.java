package restaurant;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;

    public Menu() {
        menuItems = new ArrayList<>();
        // add some initial menu items
        menuItems.add(new MenuItem(1, "Roast Beef", 15.0));
        menuItems.add(new MenuItem(2, "Chicken Korma", 12.5));
        menuItems.add(new MenuItem(3, "Jiaozi", 10.0));
    }

    public MenuItem getMenuItem(int menuItemNumber) {
        for (MenuItem menuItem : menuItems) {
            if (menuItem.getItemNumber() == menuItemNumber) {
                return menuItem;
            }
        }
        return null; // item not found
    }

    @Override
    public String toString() {
        String menuString = "restaurant.Menu:\n";
        for (MenuItem item : menuItems) {
            menuString += item + "\n";
        }
        return menuString;
    }
}