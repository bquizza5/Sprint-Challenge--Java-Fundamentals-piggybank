package piggyBank;

public class Penny implements Money {

    int quantity;

    public Penny(int quantity) {
            this.quantity = quantity;


    }

    @Override
    public Processor getProcess() {
        return new MyApplication(new MoneyCreatorImpl("penny", .01, quantity));
    }
}
