package sec01.chap04.ex04;

import sec01.chap03.ex07.Knight;
import sec01.chap03.ex07.Side;
import sec01.chap03.ex07.Swordman;
import sec01.chap03.ex07.Unit;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> int0to9 = new ArrayList<>(
                Arrays.asList(5, 2, 0, 8, 4, 1, 7, 9, 3, 6)
        );

        List<Integer> odds = new ArrayList<>();

        for (int i : int0to9) {
            if (i % 2 == 1) odds.add(i);
        }

        odds.sort(Integer::compare);
        List<String> oddStrs = new ArrayList<>();

        for (var i : odds) {
            oddStrs.add(String.valueOf(i));
        }

        var oddsStr = String.join(", ", oddStrs);

        var oddsStrStreamed = int0to9
                .stream()
                .filter(i -> i %2 == 1)
                .sorted(Integer::compare)
                .map(String::valueOf)
                .collect(Collectors.joining(","));

        Integer[] integerAry = {1, 2, 3, 4, 6, 5};
        Stream<Integer> fromArray = Arrays.stream(integerAry);
        var fromArray_Arr = fromArray.toArray();

        int[] intAry = {1, 2, 3, 4,5};
        IntStream fromIntAry = Arrays.stream(intAry);
        var fromIntArry_Ary = fromIntAry.toArray();

        double[] doubleAry = {1.1, 2.2, 3.3};
        DoubleStream fromDblAry = Arrays.stream(doubleAry);
        var fromDblArry_Ary = fromDblAry.toArray();

        IntStream withInts = IntStream.of(1, 2, 6, 3, 4, 5);
        Stream<Integer> withIntegers = Stream.of(1, 2, 3, 4 ,5);
        Stream<Unit> withUnits = Stream.of(
                new Swordman(Side.BLUE),
                new Knight(Side.RED)
        );
        var withUnits_Arr = withUnits.toArray();

        List<Integer> intAryList = new ArrayList<>(Arrays.asList(integerAry));
        Stream<Integer> fromColl1 = intAryList.stream();

        Map<String, Character> subjectGradeHM = new HashMap<>();
        subjectGradeHM.put("English", 'B');
        subjectGradeHM.put("Math", 'C');
        subjectGradeHM.put("Programming", 'A');
        var fromHashMap_Arr = subjectGradeHM.entrySet().stream().toArray();


        //  💡 빌더로 생성
        Stream.Builder<Character> builder = Stream.builder();
        builder.accept('스');
        builder.accept('트');
        builder.accept('림');
        builder.accept('빌');
        builder.accept('더');
        Stream<Character> withBuilder = builder.build();
        var withBuilder_Arr = withBuilder.toArray();

        Stream<Integer> toConcat1 = Stream.of(11, 22, 33);
        Stream<Integer> toConcat2 = Stream.of(44, 55, 66);
        Stream<Integer> withConcatMethod = Stream.concat(toConcat2, toConcat1);

        Stream<Integer> withInter1 = Stream
                .iterate(0, i -> i + 2)
                .limit(10);
        var withIter1_Arr = withInter1.toArray();

        Stream<String> withIter2 = Stream
                .iterate("홀", s -> s + (s.endsWith("홀") ? "짝" : "홀"))
                .limit(8);
        var withIter2_Arr = withIter2.toArray();

        IntStream fromRange1 = IntStream.range(10, 20);
        IntStream fromRange2 = IntStream.rangeClosed(10, 20);
        Stream<Integer> fromRangeBox = fromRange1.boxed();
        var fromRangeBox_Arr = fromRangeBox.toArray();

        IntStream randomInts = new Random().ints(5, 0, 100);
        var randomInts_Arr = randomInts.toArray();

        IntStream fromString = "Hello World".chars();


    }
}
