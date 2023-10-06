package sec01.chap01.ex16;

public class Main {
    public static void main(String[] args) {
        Button enterButton = new Button("Enter");
        ShutDownButton stdn = new ShutDownButton();
        ToggleButton tglButton = new ToggleButton("Caps Lock", false);

        enterButton.func();
        stdn.func();
        tglButton.func();
        tglButton.func();
        tglButton.func();
    }
}
