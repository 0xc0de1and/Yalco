package sec01.chap02.ex02;

public class test {
    public final int a;

    public test(int a) {
        this.a = a;
    }

    public void call (){
        System.out.println(a);
        System.out.println(this.a);
    }
}
