package sec01.chap02.ex01;

public class YTDriveThru extends YalcoChicken{
    public YTDriveThru(String name, int no) {
        super(name, no);
    }

    public void takeYTDrive(){
        System.out.printf("%d호 %s점 드라이브 스루%n"
                ,no, name
        );
    }
}
