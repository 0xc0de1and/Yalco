package sec01.chap02.ex06;

public class DropDown extends FormElement{
    String[] menus;

    public DropDown(int space, String[] menus) {
        super(space);
        this.menus = menus;
    }

    @Override
    void func() {
        System.out.println("메뉴 선택");
        for (String menu : menus){
            System.out.printf(" - %s%n", menu);
        }
    }
}
