import restaurant.Aggregator;
import restaurant.Invoker;
import restaurant.SystemInterface;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Aggregator aggregator = Aggregator.getInstance();
        Invoker invoker = new Invoker(aggregator);
        SystemInterface systemInterface = new SystemInterface(invoker);

        Scanner scanner = new Scanner(System.in);
        String input;

        while(true) {
            System.out.println("Choose an option:");
            System.out.println("1. Display restaurant.Menu");
            System.out.println("2. Submit Order");
            System.out.println("3. Display restaurant.Tab");
            System.out.println("4. Quit");

            System.out.print("Enter your choice: ");
            input = scanner.nextLine();
            switch(input) {
                case "1":
                    System.out.println(invoker.displayMenu());
                    break;
                case "2":
                    System.out.print("Enter the item number from the menu to order:");
                    int itemNumber = scanner.nextInt();
                    scanner.nextLine();  // consume the newline
                    System.out.println(invoker.submitOrder(itemNumber));
                    break;
                case "3":
                    System.out.println(invoker.displayTab());
                    break;
                case "4":
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
