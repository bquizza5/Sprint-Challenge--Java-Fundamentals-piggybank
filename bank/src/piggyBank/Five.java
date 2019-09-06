package piggyBank;

public class Five implements Money {

    int quantity;

    public Five(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Processor getProcess() {
        return new MyApplication(new MoneyCreatorImpl("Five", 5, quantity));
    }
}
