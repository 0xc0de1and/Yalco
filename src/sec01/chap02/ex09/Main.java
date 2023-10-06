package sec01.chap02.ex09;

public class Main {
    public static void main(String[] args) {
        YalcoChicken.LaunchTF launchTF1 = new YalcoChicken.LaunchTF("마산", "김영희");
        YalcoChicken store1 = launchTF1.lanch();
        YalcoChicken.Gift gift = store1.getGift("홍길동");
    }
}
