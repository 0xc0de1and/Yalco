package sec01.chap05.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thread tarzanThread = new Thread(new TarzanRun(100));
        tarzanThread.setName("타잔송");
//        tarzanThread.start();

        Thread tazanSong = new Thread(new TarzanRun(10));
        tazanSong.setName("타잔송");
        tazanSong.start();

        try (Scanner sc = new Scanner(System.in)){
            while (sc.hasNext()) {
                var line = sc.nextLine();
                if (line.equalsIgnoreCase("check")){
                    System.out.println("아직 안끝났니?");
                    System.out.println(
                            tazanSong.isAlive() ? "ㅇㅇ" : "끝"
                    );
                }
            }
        }
    }
}
