package lab.staticlab;

import sec01.chap03.ex07.Knight;
import sec01.chap03.ex07.Side;
import sec01.chap03.ex07.Unit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> test = new HashMap<>();
        test.put("a", 3);
        test.put("b", 4);
        test.put("c", 5);
        System.out.println(test.get("a"));

    }
}