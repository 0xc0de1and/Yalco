package sec01.chap05.ex06;

public class CustomerRun implements Runnable{
    String name;
    CoffeMachine coffeMachine;

    public CustomerRun(String name, CoffeMachine coffeMachine) {
        this.name = name;
        this.coffeMachine = coffeMachine;
    }

    @Override
    public void run() {
        while (true) {
            coffeMachine.takeout(this);
        }
    }
}
