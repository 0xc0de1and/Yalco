package sec01.chap03.ex06;

public class Switch extends FormElemnet implements Clickable{
    private boolean isOn;

    public Switch(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public void onClick() {
        func();
    }

    @Override
    void func() {
        isOn = !isOn;
        System.out.printf("%s로 전환%n",
                (isOn ? "ON" : "OFF")
        );
    }
}
