package sec01.chap05.ex08;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExp {
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();

        Future<String> callAnswer = es.submit(() -> {
            Thread.sleep(2000);
            return "여보세요";
        });

        while (!callAnswer.isDone()) {
            System.out.println("따르릉...");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e){

            }
        }

        String result = null;
        try {
            result = callAnswer.get();
        } catch (InterruptedException | ExecutionException e) {

        }

        System.out.println("통화시작 " + result);
        System.out.println("- - - 작업종료 - - -");
        es.shutdown();
    }
}
