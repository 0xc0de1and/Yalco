package sec01.chap02.ex04;

public abstract class YalcoGroup {
    protected static final String CREED = "우리의 %s 얄팍하다";

    private final int no;
    private final String name;

    public YalcoGroup(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public String intro () {
        return "%d호 %s점입니다%n".formatted(no, name);
    }

    public abstract void takeOrder();
}
