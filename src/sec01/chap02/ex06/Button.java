package sec01.chap02.ex06;

public class Button extends FormElement{
    private String print;

    public Button(int space, String print) {
        super(space);
        this.print = print;
    }

    @Override
    void func() {
        System.out.println(print + "입력적용");
    }
}
