package sec01.chap03.ex06;

public class Button extends FormElemnet implements Clickable{
    @Override
    public void onClick() {
     func();
    }
    @Override
    void func() {
        System.out.println("버튼 클릭");
    }
}
