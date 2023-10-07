package sec01.chap05.ex06;

public class ManagerRun implements Runnable {
    CoffeMachine coffeMachine;

    public ManagerRun(CoffeMachine coffeMachine) {
        this.coffeMachine = coffeMachine;
    }

    @Override
    public void run() {
        while (true) {
            coffeMachine.fill();
        }
    }
}
