package sec01.chap04.ex02;

public class Button {
    private String text;

    public Button(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    private Runnable onClicklistener;

    public void setOnClicklistener(Runnable onClicklistener) {
        this.onClicklistener = onClicklistener;
    }

    public void onClick() {
        onClicklistener.run();
    }
}
