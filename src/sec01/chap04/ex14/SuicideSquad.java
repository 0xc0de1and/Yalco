package sec01.chap04.ex14;

import java.util.Random;

public class SuicideSquad implements AutoCloseable{
    public void doSecretTask () throws OpFailException {
        if (new Random().nextBoolean()) {
            throw new OpFailException();
        };
    }

    @Override
    public void close() throws Exception {
        System.out.println("전원 폭사");
    }
}
