package sec01.chap02.ex07;

public class Eagle extends Bird implements Flyer, Hunter{
    public Eagle() {
        super(true);
    }

    @Override
    public void fly() {
        System.out.println("공중 비행");
    }

    @Override
    public void hunt() {

    }
}
