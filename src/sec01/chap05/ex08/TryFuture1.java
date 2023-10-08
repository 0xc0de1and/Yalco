package sec01.chap05.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class TryFuture1 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);

        List<Future<Integer>> futList = new ArrayList<>();
        IntStream.range(0, 10)
                .forEach(i -> {
                    futList.add(es.submit(new RolldiceCall()));
                });
        es.shutdown();

        ArrayList<Integer> intList = new ArrayList<>();
        for (Future<Integer> future : futList) {
            try {
                intList.add(future.get());
            } catch (InterruptedException | ExecutionException e) {}
        }
        System.out.println(String.join(
                ",",intList.stream().map(String::valueOf).toArray(String[]::new)));
    }
}
