package sec01.chap01.ex15;

public class Main {
    public static void main(String[] args) {
        YalcoChickenDT dtStore1 = new YalcoChickenDT(108, "철원");

        dtStore1.takeHallOrder();
        dtStore1.takeDTOrder();
        dtStore1.setDriveThruOpen(false);
        dtStore1.takeDTOrder();
    }
}
