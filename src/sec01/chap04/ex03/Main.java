package sec01.chap04.ex03;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> intToStrLD = (i) -> String.valueOf(i);
        Function<Integer, String> intToStrMR = String::valueOf;
        String intToStr = intToStrMR.apply(123);

        UnaryOperator<String> toLCaseLD = (s) -> s.toLowerCase();
        UnaryOperator<String> toLCaseMR = String::toLowerCase;
        String toLCase = toLCaseMR.apply("HELLO");

        Function<String, Button> strToButtonLD = s -> new Button(s);
        Function<String, Button> strToButtonMR = Button::new;
        Button button1 = strToButtonMR.apply("Dog");

        BiFunction<String, String, Button> twoStrToButtonLD = (s1, s2) -> new Button(s1, s2);
        BiFunction<String, String, Button> twoStrToButtonMR = Button::new;
        Button button2 = twoStrToButtonMR.apply("고양이", "야옹");
        button2.onClick();
        System.out.println("------------------");

        Runnable catCryLD = () -> button2.onClick();
        Runnable catCryMR = button2::onClick;
        catCryMR.run();

    }
}
