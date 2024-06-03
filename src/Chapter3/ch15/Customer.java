package Chapter3.ch15;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("customer Buy");
    }

    @Override
    public void sell() {
        System.out.println("customer Sell");
    }
    @Override
    public void order() {
        System.out.println("customer order");
    }

    public void hello() {
        System.out.println("hello");
    }
}
