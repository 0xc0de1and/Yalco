package sec01.chap04.ex07;

import sec01.chap03.ex07.Knight;
import sec01.chap03.ex07.Side;
import sec01.chap03.ex07.Swordman;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var char1 = withFinally2(3);
        var char2 = withFinally2(6);

        IntStream.rangeClosed(0,4)
                .forEach(i -> trythings(i));
        withFinally1(true);
        System.out.println("-------------------------");
        withFinally1(false);
    }

    public static void trythings (int i) {
        try {
            switch (i) {
                case 1 :
                    System.out.println((new int[1])[1]);
                case 2 :
                    System.out.println("abc".charAt(3));
                case 3 :
                    System.out.println((Knight) new Swordman(Side.BLUE));
                case 4 :
                    System.out.println(((String) null).length());
            }
            System.out.printf("%d : 예외 없이 정상실행됨%n", i);

        } catch (Exception e) {
            System.out.printf(
                    "%d : [ %s ] %s%n "
                    , i, e.getClass(), e.getMessage()
            );
            e.printStackTrace();
        }
    }

    public static void tryThings2 (int i) {
        try {
            switch (i) {
                case 1: System.out.println((new int[1])[1]);
                case 2: System.out.println("abc".charAt(3));
                case 3: System.out.println((Knight) new Swordman(Side.RED));
                case 4: System.out.println(((String) null).length());
            }
            System.out.printf("%d: 🎉 예외 없이 정상실행됨%n", i);
        } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
            System.out.printf("%d : 배열의 크기를 벗어남 %n", i);
        }  catch (ClassCastException e) {
            System.out.printf("%d : 해당 클래스로 변환불가%n", i);
        } catch (Exception e) {
            System.out.printf("%d : 기타 다른 오류%n", i);
        }
    }

    public static void withFinally1 (boolean makeException) {
        try {
            if (makeException) System.out.println("a".charAt(0));
            System.out.println("예외없이 정상실행됨");
        } catch (Exception e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("무조건 실행");
        }
    }

    public static char withFinally2 (int index) {
        String str = "Hello";
        try {
            char result = str.charAt(index);
            System.out.println("예외없이 실행됨");
            return result;
        } catch (Exception e) {
            System.out.println("예외 발생");
            return '!';
        } finally {
            System.out.println("무적권 실행");
        }
    }
}
