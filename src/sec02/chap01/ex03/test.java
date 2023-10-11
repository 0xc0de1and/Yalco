package sec02.chap01.ex03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class test {
    public static final String SONG_PATH = "src/sec12/chap03/beatles.txt";

    public static void bufferedinputEx () {
        Charset charset = StandardCharsets.UTF_8;

        try (
                BufferedInputStream bis = new BufferedInputStream(
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
                        "\n - - - %d : %d - - -\n%n",
                        ++count, readByte
                );
                System.out.println(readStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String measuretime (Runnable runnable) {
        long startTime = System.nanoTime();
        runnable.run();
        long endTime = System.nanoTime();
        return String.valueOf("%,d 나노초")
                .formatted(endTime - startTime);
    }

}
