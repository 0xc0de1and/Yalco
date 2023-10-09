package sec01.chap05.ex09;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void taketime(boolean eroor){
        try {
            int randMiliSec = new Random().nextInt(1000,1500);
            Thread.sleep(randMiliSec);
            System.out.printf(". . . %f초 경과", randMiliSec /1000.0);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        if (eroor) throw new RuntimeException("오류발생");
    }

    public static void supplyAsyncEx () throws ExecutionException, InterruptedException {
        CompletableFuture<String> getHello = CompletableFuture.supplyAsync(() -> {
            taketime(false);
            return "Hello";
        });
    }
}
