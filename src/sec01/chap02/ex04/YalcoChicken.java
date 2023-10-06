package sec01.chap02.ex04;

public class YalcoChicken extends YalcoGroup{

    protected static int lastNo = 0;

    public YalcoChicken(String name) {
        super(++lastNo, name);
    }

    public static String getCreed(){
        return CREED.formatted("튀김옷은");
    }

    @Override
    public void takeOrder() {
        System.out.printf("얄코치킨 %s치킨을 주문해주세요%n",super.intro());
    }
}
