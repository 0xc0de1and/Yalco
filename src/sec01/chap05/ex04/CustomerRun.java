package sec01.chap05.ex04;

import java.util.HashMap;
import java.util.Map;

public class CustomerRun implements Runnable{
    String name;
    ATM atmToUse;
    int needed;

    public CustomerRun(String name, ATM atmToUse, int needed) {
        this.name = name;
        this.atmToUse = atmToUse;
        this.needed = needed;
    }

    public String getName() {
        return name;
    }

    public int getNeeded() {
        return needed;
    }


    @Override
    public void run() {
        while (atmToUse.getBalance() > needed) {
            atmToUse.withdraw(name, needed);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        atmToUse.getRemainingAmount();
    }

}
