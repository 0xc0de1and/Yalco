package sec01.chap02.ex06;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button(2, "Enter");
        Switch switch1 = new Switch(3, true);
        DropDown dropDown1 = new DropDown(5, new String[]{
                "이름 오름차순", "이름 내림차순", "크기 오름차순", "크기 내림차순", "날짜 오름차순", "날짜 내림차순"
        });

        String a = "asdf";
        clickFormElemnet(button1);

        clickFormElemnet(switch1);
        clickFormElemnet(switch1);
        clickFormElemnet(switch1);

        clickFormElemnet(dropDown1);
    }

    public static void clickFormElemnet(FormElement fe){
        fe.func();
    }
}
