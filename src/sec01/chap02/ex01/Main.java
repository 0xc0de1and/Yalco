package sec01.chap02.ex01;

public class Main {
    public static void main(String[] args) {
        YalcoChicken[] ytstore =
                {
                        new YalcoChicken("강남", 1),
                        new YalcoChicken("서초", 2),
                        new YTDriveThru("송파DT", 3),
                };

        for (YalcoChicken store : ytstore){
            if (store instanceof YTDriveThru){
                ((YTDriveThru) store).takeYTDrive();
            } else store.takeHallOrder();
        }
    }
}
