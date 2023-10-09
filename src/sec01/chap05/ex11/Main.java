package sec01.chap05.ex11;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        //  3개의 쓰레드에서 한 해시맵에 10000개의 데이터를 주입

//        Map<String, Integer> hashMap = new HashMap<>();
//
//        Runnable toHashMap = () -> {
//            for (int i = 0; i < 10000; i++) {
//                hashMap.put("key" + i, i);
//            }
//        };
//
//        Thread t1 = new Thread(toHashMap);
//        Thread t2 = new Thread(toHashMap);
//        Thread t3 = new Thread(toHashMap);
//
//        t1.start(); t2.start(); t3.start();
//
//        try {
//            t1.join(); t2.join(); t3.join();
//        } catch (InterruptedException e) {}

        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        Runnable toHashMap = () -> {
            for (int i = 0; i < 10000; i++) {
                hashMap.put("Key" + i, i);
            }
        };

        Runnable toConcurrHashMap = () -> {
            for (int i = 0; i < 10000; i++) {
                concurrentHashMap.put("key" + i, i);
            }
        };


        measureTime("Concurrent 해시맵", () -> {
            Thread t1 = new Thread(toConcurrHashMap);
            Thread t2 = new Thread(toConcurrHashMap);
            Thread t3 = new Thread(toConcurrHashMap);

            t1.start(); t2.start(); t3.start();
            try {
                t1.join(); t2.join(); t3.join();
            } catch (InterruptedException e) {}

            System.out.printf(
                    "Concurrent 해시맵 사이즈 = %d%n",
                    concurrentHashMap.size()
            );
        });

        measureTime("일반 해쉬맵", () -> {
            Thread t1 = new Thread(toHashMap);
            Thread t2 = new Thread(toHashMap);
            Thread t3 = new Thread(toHashMap);
            t1.start(); t2.start(); t3.start();
            try {
                t1.join(); t2.join(); t3.join();
            } catch (InterruptedException e) {}

            System.out.printf(
                    "일반 해시맵 사이즈 : %d%n",
                    hashMap.size()
            );
        });

        measureTime("Concurrent 해시맵", () -> {
            Thread t1 = new Thread(toConcurrHashMap);
            Thread t2 = new Thread(toConcurrHashMap);
            Thread t3 = new Thread(toConcurrHashMap);

            t1.start(); t2.start(); t3.start();
            try {
                t1.join(); t2.join(); t3.join();
            } catch (InterruptedException e) {}

            System.out.printf(
                    "Concurrent 해시맵 사이즈 = %d%n",
                    concurrentHashMap.size()
            );
        });
    };



    public static void measureTime(String taskName, Runnable runnable) {
        long startTime = System.nanoTime();
        runnable.run();
        long endTime = System.nanoTime();
        System.out.printf(
                "⌛️ %s 소요시간: %,d 나노초%n",
                taskName,
                endTime - startTime
        );
    }
}
