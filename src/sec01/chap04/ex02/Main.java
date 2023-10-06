package sec01.chap04.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Runnable dogButtonFunc = () -> System.out.println("멍멍");
        Runnable cataButtonFunc = () -> System.out.println("야옹");

        Button dogButton = new Button("강아지");
        dogButton.setOnClicklistener(dogButtonFunc);
        dogButton.onClick();

        Button catButton = new Button("고양이");
        catButton.setOnClicklistener(() -> {
            System.out.println("----------------");
            System.out.println(catButton.getText() + "울음소리 : 야옹야옹");
            System.out.println("----------------");
        });
        catButton.onClick();

        Supplier<String> appName = () -> "얄코오피스";
        Supplier<Double> rand0to10 = () -> Math.random() * 10;
        Supplier<Boolean> randTF = () -> Math.random() > 0.5;

        var supp1 = appName.get();
        var supp2 = rand0to10.get();
        var supp3 = randTF.get();

        Consumer<Integer> sayOddEven = i -> System.out.printf(
                "%d은 %c수 입니다.%n", i, "짝홀".charAt(i % 2)
        );

        Consumer<Button> buttontest = i -> i.onClick();

        sayOddEven.accept(3);
        buttontest.accept(catButton);

        BiConsumer<Button, Integer> clickButtonNTimes = (b, n) -> {
            for (int i = 0; i < n; i++) {
                b.onClick();
            }
        };

        clickButtonNTimes.accept(catButton, 3);

        new ArrayList<>(
                Arrays.asList("하나", "둘", "셋", "넷", "다섯")
        ).forEach(s -> System.out.println(s));
        HashMap<String, Character> subjectGradeHM = new HashMap<>();
        subjectGradeHM.put("English", 'B');
        subjectGradeHM.put("Math", 'C');
        subjectGradeHM.put("Programming", 'A');

        //  💡 BiConsumer를 받음
        subjectGradeHM.forEach(
                (s, g) -> System.out.println(
                        "%s : %c".formatted(s, g)
                )
        );
    }
}
