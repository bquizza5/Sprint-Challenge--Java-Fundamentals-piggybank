package piggyBank;

public class MyApplication implements Processor {

    private MoneyCreationServices msgSrv;

    public MyApplication(MoneyCreationServices msgSrv) {
        this.msgSrv = msgSrv;
    }

    @Override
    public void displayMoney() {
        msgSrv.displayMoney();
    }
    @Override
    public double returnTotal() {
       return msgSrv.returnTotal();
    }
}
