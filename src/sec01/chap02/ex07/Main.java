package sec01.chap02.ex07;

public class Main {
    public static void main(String[] args) {
        PolarBear polarBear = new PolarBear();
        Mamal mamal = polarBear;
        Hunter hunter = polarBear;

        GlidingLizard gl = new GlidingLizard();
        Eagle eagle = new Eagle();

        Hunter[] hunters = {
                polarBear, gl, eagle
        };
    }
}
