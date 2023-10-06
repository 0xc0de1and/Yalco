package sec01.chap02.ex12;

import sec01.chap01.ex02.YalcoChicken;

public class Main {
    public static void main(String[] args) {
        YalcoChickenMenu menu1 = YalcoChickenMenu.FR;
        YalcoChickenMenu menu2 = YalcoChickenMenu.GJ;
        YalcoChickenMenu menu3 = YalcoChickenMenu.YN;

        var menu1Name = menu1.getName();
        var menu2Price = menu2.getPrice();
        var menu1Desc = menu1.getDesc();

        menu2.setPrice(16000);
        menu2Price = menu2.getPrice();

        var byNames = new YalcoChickenMenu[] {
                YalcoChickenMenu.valueOf("FR"),
                YalcoChickenMenu.valueOf("GJ")
        };

        var menus = YalcoChickenMenu.values();

        for (YalcoChickenMenu test : menus){
            System.out.println(test.getDesc());
        }


    }
}
