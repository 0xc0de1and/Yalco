package sec01.chap05.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        IntStream.range(0, 10)
                .forEach(i -> {
                    try {
                        intList.add(new RolldiceCall().call());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });

        System.out.println(String.join(
                ",",
                intList.stream()
                        .map(String::valueOf)
                        .toArray(String[]::new)
        ));
    }
}
