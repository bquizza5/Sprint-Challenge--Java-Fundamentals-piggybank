package piggyBank;

public class MoneyCreatorImpl implements MoneyCreationServices {
        String name;
        double worth;
        int quantity;

    public MoneyCreatorImpl(String name, double worth, int quantity) {
        this.name = name;
        this.worth = worth;
        this.quantity = quantity;
    }


    @Override
    public void displayMoney() {
        System.out.println(quantity + " " + name);
    }

    @Override
    public double returnTotal() {
//        System.out.println(worth * quantity);
        return worth * quantity;
    }

}
