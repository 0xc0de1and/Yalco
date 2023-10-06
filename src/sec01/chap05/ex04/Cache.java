package sec01.chap05.ex04;

public class Cache {
    static boolean stop = false;

    synchronized public static boolean isStop() {
        return stop;
    }

    synchronized public static void setStop(boolean stop) {
        Cache.stop = stop;
    }

    public static void main(String[] args) {
        Thread thr1 = new Thread(() ->{
            while (!isStop()) {
                int i = 0;
                i++;
            }
        });
        thr1.start();

        setStop(true);
        System.out.println("쓰레드 종료");
    }
}
