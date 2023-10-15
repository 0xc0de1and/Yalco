package sec03.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    @Count(value = 3)
    private int apples;

    @Count
    private int bananas;

    @Count(5)
    private int cacaos;

    @PersonName(last = "홍", first = "길동")
    private Object seller;

    @PersonInfo(
            personName = @PersonName(last = "전", first = "우치"),
            age = 30,
            married = true
    )
    private Object sellerInfo;


    @LocsAvail(
            quick = {"서울", "대전", "강원"},
            visit = "판교",
            delivery = {}
    )
    private Object store;

    public static void main(String[] args) {
        List<Object> annotVals = new ArrayList<>();

        for (var f : Main.class.getDeclaredFields()) {
            for (var a : f.getAnnotations()) {
                if (a instanceof Count) {
                    annotVals.add(((Count) a).value());
                }
                if (a instanceof PersonName) {
                    annotVals.add(((PersonName) a).first());
                }
                if (a instanceof PersonInfo) {
                    annotVals.add(((PersonInfo) a).personName().first());
                    annotVals.add(((PersonInfo) a).personName().last());
                    annotVals.add(((PersonInfo) a).age());
                    annotVals.add(((PersonInfo) a).married());
                }
                if (a instanceof LocsAvail) {
                    annotVals.add((((LocsAvail) a).visit()));
                    annotVals.add((((LocsAvail) a).delivery()));
                    annotVals.add((((LocsAvail) a).quick()));
                }
            }
        }

    }
}
