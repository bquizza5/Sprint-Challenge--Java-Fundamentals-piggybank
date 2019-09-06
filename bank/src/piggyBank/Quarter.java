package piggyBank;

public class Quarter implements Money {

    int quantity;

    public Quarter(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Processor getProcess() {
        return new MyApplication(new MoneyCreatorImpl("quarter", .25, quantity));
    }
}


//public class Quarter extends Money {
//
//    private String name;
//
//
//    public Quarter(int quantity){
//        super(quantity);
//        name = "Quarter";
//    }
//
//
//    public String getName(){
//        return name;
//    }
//
//
//
//    @Override
//    public double getTotal() {
//        return 0.25 * quantity;
//    }
//}
