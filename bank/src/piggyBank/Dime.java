package piggyBank;

public class Dime implements Money {

    int quantity;

    public Dime(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Processor getProcess() {
        return new MyApplication(new MoneyCreatorImpl("dime", .10, quantity));
    }
}
