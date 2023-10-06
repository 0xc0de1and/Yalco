package sec01.chap01.ex06;

public class Main {
    public static void main(String[] args){
        YalcoChicken store1 = new YalcoChicken(1, "강남");
        YalcoChicken store2 = new YalcoChicken(2, "판교");

        System.out.println(store1.intro());
        System.out.println(store2.intro());
    }
}
