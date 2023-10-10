package sec02.chap01.ex03;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static final String SONG_PATH = "src/sec02/chap01/ex03/beatles.txt";

    public static void main(String[] args) {
//        fileInputStrmEx1();
//        fileInputStrmEx2();
//        fileInputStrmEx3();
//        bufferedInputEx();

        var fis1 = measureTime(Main::fileInputStrmEx1);
        var fis2 = measureTime(Main::fileInputStrmEx2);
        var fis3 = measureTime(Main::fileInputStrmEx3);
        var bis = measureTime(Main::bufferedInputEx);
    }

    public static void fileInputStrmEx1() {
        try (FileInputStream fis = new FileInputStream(SONG_PATH)) {
            int readByte;

            while ((readByte = fis.read()) != -1) {
                char readChar = (char) readByte;
                System.out.print(readByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileInputStrmEx2() {
        Charset charset = StandardCharsets.UTF_8;

        try (
                FileInputStream fis = new FileInputStream(SONG_PATH);
                InputStreamReader isr = new InputStreamReader(fis, charset)
        ) {
            int readByte;
            while ((readByte = isr.read()) != -1) {
                char readChar = (char) readByte;
                System.out.print(readChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileInputStrmEx3 () {
        byte[] buffer =new byte[1024];
        Charset charset = StandardCharsets.UTF_8;

        try (FileInputStream fis = new FileInputStream(SONG_PATH)){
            int readByte;
            int count = 0;

            while ((readByte =fis.read(buffer)) != -1) {
                String readStr = new String(
                        buffer, 0, readByte, charset
                );

                System.out.printf(
                        "\n - - - %d : %d - - - \n%n",
                        ++count, readByte
                );
                System.out.println(readStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bufferedInputEx () {
        Charset charset = StandardCharsets.UTF_8;
        try (BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(SONG_PATH)
        )
        ) {
           byte[] buffer = new byte[1024];
           int readByte;
           int count = 0;

           while ((readByte = bis.read(buffer)) != -1) {
               String readStr = new String(
                       buffer, 0, readByte, charset
               );
               System.out.printf(
                       "\n - - - %d : %d - - - \n%n",
                       ++count, readByte
               );
               System.out.println(readStr);
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String measureTime (Runnable runnable) {
        long startTime = System.nanoTime();
        runnable.run();
        long endTime = System.nanoTime();
        return String.valueOf("%,d 나노초")
                .formatted(endTime - startTime);
    }

}