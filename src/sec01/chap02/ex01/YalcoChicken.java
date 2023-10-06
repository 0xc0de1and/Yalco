package sec01.chap02.ex01;

public class YalcoChicken {
    protected String name;
    protected int no;

    public YalcoChicken(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public void takeHallOrder() {
        System.out.printf(
                "%d호, %s점 홀 주문%n"
                ,no ,name
        );
    }
}
