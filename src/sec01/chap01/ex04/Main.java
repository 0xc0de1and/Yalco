package sec01.chap01.ex04;

public class Main {
    public static void main(String[] args) {
        Yalco button1 = new Yalco('1', 1, "DARK");
        Yalco buttonPls = new Yalco('+', 3, "DARK");
        Yalco buttonClear = new Yalco('C', 2, "Dark");

        buttonPls.place();
        button1.place();
        buttonClear.place();
    }
}
