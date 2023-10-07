package sec01.chap05.ex05;

public class SoldierRun implements Runnable{
    String title;
    PhoneBoot phoneBoot;

    public SoldierRun(String title, PhoneBoot phoneBoot) {
        this.title = title;
        this.phoneBoot = phoneBoot;
    }

    @Override
    public void run() {
        while (true) {
            phoneBoot.phonecall(this);
        }

    }
}
