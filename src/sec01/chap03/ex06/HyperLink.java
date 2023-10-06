package sec01.chap03.ex06;

public class HyperLink implements Clickable{
    @Override
    public void onClick() {
        System.out.println("링크로 이동");
    }
}
