package sec01.chap05.ex06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CoffeMachine coffeeMachine = new CoffeMachine();

        Arrays.stream("철수,영희,돌준,병미,핫훈,짱은,밥태".split(","))
                .forEach(s -> new Thread(
                        new CustomerRun(s, coffeeMachine)
                ).start());

        new Thread(new ManagerRun(coffeeMachine)).start();
    }
}
