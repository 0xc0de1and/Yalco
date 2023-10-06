package sec01.chap02.ex04;

public class Main {
    public static void main(String[] args) {
//        YalcoGroup yg = new YalcoGroup(1, "강남"); abstract라서 불가

        YalcoChicken yc1 = new YalcoChicken("강남");
        YalcoChicken yc2 = new YalcoChicken("판교");
        YalcoChicken yc3 = new YalcoChicken("서초");
        YalcoCafe ycf1 = new YalcoCafe("울산", false);
        YalcoCafe ycf2 = new YalcoCafe("부산", false);
        YalcoCafe ycf3 = new YalcoCafe("대구", true);

        YalcoGroup[] ycgs = {yc1,yc2,yc3,ycf1,ycf2,ycf3};

        for (YalcoGroup ycg : ycgs){
            ycg.takeOrder();
        }
    }
}
