package sec01.chap04.ex15;

import java.util.Optional;
import java.util.Random;

public class Main {
    public static Optional<String> getCatOpt () {
        return Optional.ofNullable(
                new Random().nextBoolean() ? "Cat" : null
        );
    }

    public static void main(String[] args) {
        //  try-catch 문으로 NPE에 대비하기
        //  반복실행해 볼 것
        try {
            System.out.println(
                    catOrNull().length()
            );
        } catch (NullPointerException ne) {
            ne.printStackTrace();
            System.out.println(0);
        }

        Optional<String> catOpt = Optional.of("Cat");
        catOpt = getCatOpt();
    }

    public static String catOrNull () {
        //  슈뢰딩거의 고양이
        return new Random().nextBoolean() ? "Cat" : null;
    }
}
