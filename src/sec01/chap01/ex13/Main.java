package sec01.chap01.ex13;

public class Main {

    public static void main(String[] args) {
        Button test = new Button('1', 1);
        test.setSpace(2);
        test.setSpace(-1);
        System.out.println(test.getButtonInfo());
    }
}
