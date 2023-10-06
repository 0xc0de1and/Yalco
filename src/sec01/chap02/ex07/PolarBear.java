package sec01.chap02.ex07;

public class PolarBear extends Mamal implements Hunter, Swimmer {
    public PolarBear() {
        super(false);
    }

    @Override
    public void hunt() {
        System.out.println(position + ": 물범 사냥");
    }

    @Override
    public void swim() {
        System.out.println("앞발로 수영");
    }
}