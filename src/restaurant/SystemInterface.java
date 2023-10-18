package restaurant;

public class SystemInterface {
    private Invoker invoker;

    public SystemInterface(Invoker invoker) {
        this.invoker = invoker;
    }

    public void run() {
        System.out.println(invoker.displayMenu());
        System.out.println(invoker.submitOrder(1));
        System.out.println(invoker.displayTab());
    }
}