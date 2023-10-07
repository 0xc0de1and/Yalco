package sec01.chap05.ex05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PhoneBoot phonebooth = new PhoneBoot();
        Arrays.stream("김병장,이상병,박일병,최이병".split(","))
                .forEach(s -> new Thread(new SoldierRun(s, phonebooth)).start());
    }
}
