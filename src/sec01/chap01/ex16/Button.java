package sec01.chap01.ex16;

public class Button {
    private String print;

    public Button(String print) {
        this.print = print;
    }

    public void func(){
        System.out.printf("%s : 입력적용%n", print);
    }
}
