package sec01.chap01.ex04;

public class Yalco {

    char print;
    int spcae;
    String mode;

    public Yalco(char print, int spcae, String mode) {
        this.print = print;
        this.spcae = spcae;
        this.mode = mode;
    }

    void place(){
        System.out.printf(
                "표시 : %c, 공간 : %s, 모드 : %s%n",
                print, spcae, mode
        );
    }
}
