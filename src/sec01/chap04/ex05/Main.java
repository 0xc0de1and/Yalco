package sec01.chap04.ex05;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream
                .range(1, 100)
                .filter(i -> i % 2 == 0)
                .skip(10)
                .limit(10)
                .map(i -> i *10)
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        String str1 ="Hello World! Welcome to the world of Java~";
        str1.chars().forEach(System.out::println);

        char str1MaxChar = (char) str1.chars()
                .max()
                .getAsInt();

        str1.chars()
                .sorted()
                .distinct()
                .filter(Character::isLetter)
                .forEach(i -> System.out.print((char) i));

        var fromStr1 = str1.chars()
                .boxed()
                .map(i -> String.valueOf((char) i.intValue()))
                .map(String::toUpperCase)
                .filter(s -> Character.isLetter(s.charAt(0)))
                .sorted()
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println("==========================");
        var oddSquaresR = IntStream.range(0, 10).boxed()
                .peek(i -> System.out.println("초기값 " + i))
                .filter(i -> i % 2 == 1)
                .peek(i -> System.out.println("홀수 " + i))
                .map(i -> i * i)
                .peek(i -> System.out.println("제곱 " + i))
                .sorted((i1 ,i2) -> i1 < i2 ? 1 : -1)
                .peek(i -> System.out.println("역순 : " + i))
                .filter(i -> i > 10)
                .peek(i -> System.out.println("실험 : " + i))
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(oddSquaresR);

        Integer[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        allMatch : 모든 요소
//        anyMatch : 어느 한 요소
        boolean intsMatch = Arrays.stream(ints)
                .anyMatch(i -> i < 0);

        System.out.println("=============================");

        long afterWhileOp = Arrays.stream(ints)
                .takeWhile(i -> i > 4)
                .peek(System.out::println)
                .count();

        int intsSum = IntStream.range(0, 101)
                .filter(i -> i % 2 == 0)
                .sum();

        System.out.println("======================");

        double doublSum = DoubleStream.iterate(3.14, i -> i * 2)
                .limit(10)
                .peek(System.out::println)
                .sum();

        int intReduce = IntStream.range(1, 10)
                .filter(i -> i % 2 == 1)
                .reduce((prev, curr) -> {
                    return prev * curr;
                })
                .getAsInt();
    }
}
