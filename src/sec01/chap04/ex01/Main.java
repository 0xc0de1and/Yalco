package sec01.chap04.ex01;

import java.security.Signature;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer() {
            @Override
            public void print() {
                System.out.println("람다식이 없었을 때 방식");
            }
        };

        Printer printer2 = () -> System.out.println("인자도 반환값도 없는 람다식");

        Printer printer3 = () -> System.out.println("반환값 없을 시 { } 생략가능");
        Printer printer4 = () -> {
            System.out.println("코드 여러줄일때는");
            System.out.println("{} 필요");
        };

        for (var p : new Printer[] {printer1, printer2, printer3, printer4}){
            p.print();
        }

        Retuner retuner1 = () -> 1;
        Retuner retuner2 = () -> "반환 코드만 있을 시 {} 와 return 생략가능";

        SingleParam squre = (i) -> i * i;
        SingleParam cube = i -> i * i * i;

        var _3_squuraed = squre.func(3);
        var _3_cube = squre.func(3);

        DoubleParam test1 = (a, b) -> a * b;
        var test2 = test1.func(3, 3);
        DoubleParam test3 = (a, b) -> {
            System.out.printf("%d, x %d = %d%n",
                    a, b, a * b);
            return a * b;
        };
        test3.func(3, 5);



    }
}
