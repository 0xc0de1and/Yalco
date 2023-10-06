package sec01.chap02.ex06;

public class Switch extends FormElement{
    boolean on;

    public Switch(int space, boolean on) {
        super(space);
        this.on = on;
    }

    @Override
    void func() {
        on = !on;
        System.out.println((on ? "ON" : "OFF") + "로 전환");
    }
}
