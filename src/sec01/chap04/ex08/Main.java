package sec01.chap04.ex08;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
//        registerDutyMonth("정핫훈", 7);
//        registerDutyMonth("김돌준", 13);

        openMyFile("잘나온얼굴.png");
        System.out.println("================");
        openMyFile("야구동영상.avi");
    }

    public static void registerDutyMonth(String name, int month){
        if (month < 1 || month > 12) {
            throw new IndexOutOfBoundsException(
                    "달은 1~12월 입니다. %s씨"
                            .formatted(name)
            );
        }
        System.out.printf("%s씨 %d월 담당으로 배정되셨어요.%n", name, month);
    }

    public static void openMyFile (String filName) {
            if (filName.contains("야구동영상")) {
                try {
                    throw new FileNotFoundException(
                            "컴퓨터에는 그런 것이 없습니다."
                    );
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.out.println("인강프로그램을 실행합니다.");
                }
                return;
            }
        System.out.printf("%s 파일 열람%n", filName);
    }
}
