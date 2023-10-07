package sec01.chap05.ex05;

public class PhoneBoot {
    synchronized public void phonecall (SoldierRun solider) {
        System.out.printf("%s 전화 사용 중 . . .%n",
                solider.title
        );

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }

        System.out.printf("%s 전화 사용 완료%n",
                solider.title
        );

        notifyAll();
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
