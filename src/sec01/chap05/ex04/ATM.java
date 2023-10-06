package sec01.chap05.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ATM {
    private int balance;
    Map<String, Integer> RemaingAmount = new HashMap<>();
    public void addMoney(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    synchronized public void withdraw(String name, int amount) {
        if (RemaingAmount.get(name) == null) {
            RemaingAmount.put(name, 0);
        }
        RemaingAmount.put(name, RemaingAmount.get(name) + amount);


            System.out.printf("%s인출 요청 (현 잔액 %d)%n",
                    name, balance);
            try {
                Thread.sleep(new Random().nextInt(5, 10));
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            balance -= amount;
            System.out.printf("%s 인출완료 (현 잔액%d)%n",
                    name, balance);

    }

    public void getRemainingAmount() {
        for (var entry : RemaingAmount.entrySet()) {
            String name = entry.getKey();
            Integer amount = entry.getValue();
            System.out.printf("[%s]의 현재 잔액 : %d%n", name, amount);
        }
    }
}
