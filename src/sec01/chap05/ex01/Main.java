package sec01.chap05.ex01;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread(new MyRunnable());

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.print(3);
                }
            }
        });

//        thread1.run();
//        thread2.run();
//        thread3.run();

//        thread1.start();
//        thread2.start();
//        thread3.start();





    }
}
