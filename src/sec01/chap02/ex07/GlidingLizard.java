package sec01.chap02.ex07;

public class GlidingLizard extends Reptile implements Hunter, Swimmer, Flyer{
    public GlidingLizard() {
        super(true);
    }

    @Override
    public void fly() {
        System.out.println(aka + "날개로 하강");
    }

    @Override
    public void hunt() {
        System.out.println(position + "벌레 사냥");
    }

    @Override
    public void swim() {
        System.out.println(fin + "없지만 꼬리로 수영");
    }
}
