package sec01.chap01.ex12;

public class Main {
    public static void main(String[] args) {
        Button test1 = new Button('1', 1);
        Button test2 = new Button('2', 5);
        Button test3 = new Button('3', 8);

        Button[] buttons = {test1, test2, test3};

        System.out.println(Button.mode);
        for (Button tests : buttons){
            tests.place();
        }

        Button.switchMode();
        System.out.println(Button.mode);
        for (Button tests : buttons){
            tests.place();
        }

    }
}
