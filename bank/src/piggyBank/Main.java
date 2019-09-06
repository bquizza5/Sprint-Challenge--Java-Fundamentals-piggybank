package piggyBank;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {

        ArrayList<Money> pBank = new ArrayList<Money>();

        pBank.add(new Quarter(1));
        pBank.add(new Dime(1));
        pBank.add(new Dollar(5));
        pBank.add(new Nickel(3));
        pBank.add(new Dime(7));
        pBank.add(new Dollar(1));
        pBank.add(new Penny(1));

//        new Quarter(2).getProcess().returnTotal();


        double total = 0.0;

        for (Money money : pBank) {
            money.getProcess().displayMoney();
            total = total + money.getProcess().returnTotal();
        }

        System.out.println("\nTotal: $" + total);


    }
}