package sec01.chap05.ex01;

public class Thread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(1);
        }
    }
}
