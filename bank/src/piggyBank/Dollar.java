package piggyBank;

public class Dollar implements Money {

    int quantity;

    public Dollar(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Processor getProcess() {
        return new MyApplication(new MoneyCreatorImpl("Dollar", 1, quantity));
    }
}
