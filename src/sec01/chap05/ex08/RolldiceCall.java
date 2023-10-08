package sec01.chap05.ex08;

import java.util.Random;
import java.util.concurrent.Callable;

public class RolldiceCall implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        var result = new Random().nextInt(0, 6) + 1;
        System.out.println(result);
        return result;
    }
}
