package sec01.chap05.ex07;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);

        Cave cave = new Cave();

        while (cave.getWater() > 20) {
            es.execute(new VolunteerRun(cave));

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                return;
            }
        }
//        es.shutdown();
//        es.execute(new VolunteerRun(cave));


        List<Runnable> waitings = es.shutdownNow();
        System.out.println(waitings);
    }
}
