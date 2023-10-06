package sec01.chap03.ex01;

public class Button {
    public enum Mode{
        LIGHT("라이트"),DARK("다크");
        String indcator;
        Mode(String indcator) {
            this.indcator = indcator;
        }
    }

    private String name;
    private Mode mode;
    private int spaces;

    public Button(String name, Mode mode, int spaces) {
        this.name = name;
        this.mode = mode;
        this.spaces = spaces;
    }

    public String toString() {
        return "%s, %s, %d".formatted(name, mode, spaces);
    }
}
