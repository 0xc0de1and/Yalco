package sec01.chap05.ex10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Character> stream1 = Stream.of('A', 'B', 'C');
        var bool1 = stream1.isParallel();

        stream1.parallel();
        var bool2 = stream1.isParallel();

        stream1.sequential();
        var bool3 = stream1.isParallel();

        Stream<Integer> stream2 = Arrays.asList(1, 2, 3, 4, 5)
                .parallelStream();

        List<Double> dblList = new ArrayList<>(
                Arrays.asList(1.23, 2.34, 3.45)
        );

        Stream<Double> stream3 = dblList.parallelStream();

        final int RANGE = 10000000;

        measureTime("병렬필터", () -> {
            var filtered = IntStream.range(0, RANGE)
                    .filter(i -> i % 2 == 0);
        });

        System.out.println("------------------------");

        measureTime("직렬 매핑", () -> {
            var mapped = IntStream.range(0, RANGE).boxed()
                    .map(String::valueOf);
        });
        measureTime("병렬 매핑", () -> {
            var mapped = IntStream.range(0, RANGE).boxed()
                    .parallel()
                    .map(String::valueOf);
        });
        System.out.println("-------------------------");

        measureTime("직렬 접기", () -> {
            var reduced = IntStream.range(0, RANGE)
                    .reduce(Integer::sum);
        });
        measureTime("병렬 접기", () -> {
            var reduced = IntStream.range(0, RANGE)
                    .parallel()
                    .reduce(Integer::sum);
        });
        System.out.println("------------------------");

        measureTime("직렬 합계", () -> {
            var sum = IntStream.range(0, RANGE)
                    .sum();
        });
        measureTime("병렬 합계", () -> {
            var sum = IntStream.range(0, RANGE)
                    .parallel()
                    .sum();
        });

        System.out.println("\n- - - - -\n");

        final int TRI_RANGE = 10;
        //final int TRI_RANGE = RANGE; // 혼합이 더 느려짐

        measureTime("직렬 3종", () -> {
            var tri = IntStream.range(0, TRI_RANGE)
                    .filter(i -> i % 2 == 0)
                    .map(i -> i + 1)
                    .reduce(Integer::sum);
        });
        measureTime("병렬 3종", () -> {
            var tri = IntStream.range(0, TRI_RANGE)
                    .parallel()
                    .filter(i -> i % 2 == 0)
                    .map(i -> i + 1)
                    .reduce(Integer::sum);
        });

        //  ⭐️ 작업에 따라 병렬과 직렬의 혼합이 유리할 수 있음
        //  - 이 작업의 경우 : 데이터 개수가 적음
        //  - 성능이 중요할 시 테스트해가며 최적의 코드를 찾을 것
        measureTime("혼합 3종", () -> {
            var tri = IntStream.range(0, TRI_RANGE)
                    .parallel()
                    .filter(i -> i % 2 == 0)
                    .map(i -> i + 1)
                    .sequential() // ⭐️
                    .reduce(Integer::sum);
        });
    }
    public static void measureTime (String taaskName, Runnable runnable) {
        long startTime = System.nanoTime();
        runnable.run();
        long endTime = System.nanoTime();

        System.out.printf(
                "%s 소요시간 %12d 나노초%n",
                taaskName,
                endTime - startTime);
    }
}
