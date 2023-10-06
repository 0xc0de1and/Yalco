package sec01.chap01.ex05;

public class Main {
    public static void main(String[] args) {
        YalcoChicken store1 = new YalcoChicken();
        store1.name = "강남";
        store1.no = 1;

        YalcoChicken store2 = new YalcoChicken();
        store2.name = "판교";
        store2.no = 2;

        System.out.println(store1.intro());
        System.out.println(store2.intro());
    }
}
