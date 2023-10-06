package sec01.chap02.ex11;

public class Button {
    enum Mode {LIGHT, DARK}
    enum Space {SINGLE, DOUBLE, TRIPLE}

    private Mode mode;
    private Space space;

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setSpace(Space space) {
        this.space = space;
    }
}
