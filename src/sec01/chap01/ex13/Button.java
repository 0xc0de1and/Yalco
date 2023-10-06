package sec01.chap01.ex13;

public class Button {
    private static String mode = "Light";
    public static void switchMode(){
        mode = mode.equals("Light") ? "Dark" : "Light";
    }

    private char print;
    private int space = 1;

    public Button (char print, int space) {
        this.print = print;
        this.space = space;
    }

    public void setSpace(int a) {
        if (space < 1 || space > 4) return;
        this.space = space;
    }

    public String getButtonInfo() {
        return "버튼 : %c, 공간 : %d"
                .formatted(print, space); // 리턴 값은 print가 아님 변수에 저장해주는 것.
    }

}
