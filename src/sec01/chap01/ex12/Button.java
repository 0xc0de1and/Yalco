package sec01.chap01.ex12;

public class Button {
    char c;
    int space = 1;
    static String mode = "Light";

    Button(char c, int space){
        this.c = c;
        this.space = space;
    }

    static void switchMode() {
        mode = mode.equals("Light") ? "Dark" : "Light";
    }

    void place(){
        System.out.printf("표시 : %c, 공간 : %d, 모드 : %s%n",c ,space, mode);
    }

//    static void placea(){
//        System.out.printf("표시 : %c, 공간 : %d, 모드 : %s%n",Button ,space, mode);
//    }
}
