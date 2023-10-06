package sec01.chap03.ex06;

public abstract class FormElemnet {
    public enum MODE {LIGHT, DARK}

    private static MODE mode = MODE.LIGHT;

    public void printMode() {
        System.out.println(mode);
    }

    abstract void func ();
}
