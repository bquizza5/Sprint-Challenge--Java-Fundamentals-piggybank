package piggyBank;

public class Nickel implements Money {

    int quantity;

    public Nickel(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Processor getProcess() {
        return new MyApplication(new MoneyCreatorImpl("nickel", .05, quantity));
    }
}
