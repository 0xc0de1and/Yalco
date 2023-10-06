package sec01.chap02.ex06;

public abstract class FormElement {
    protected int Space;

    public FormElement(int space) {
        this.Space = space;
    }

    abstract void func();
}
