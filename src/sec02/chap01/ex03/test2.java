package sec02.chap01.ex03;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class test2 {
    public static final String SONG_PATH = "src/sec12/chap03/beatles.txt";
    public static final String IMG_PATH = "src/sec12/chap03/windows.jpeg";

    public static void writeLittleStar() {
        var filepath = "src/sec12/chap03/little_star.txt";
        Charset charset = StandardCharsets.UTF_8;

        List<String> lines = Arrays.asList(
                "반짝반짝 작은 별,",
                "아름답게 비치네.",
                "동쪽 하늘에서도",
                "서쪽 하늘에서도",
                "반짝반짝 작은 별,",
                "아름답게 비치네."
        );

        try (
                BufferedOutputStream bos = new BufferedOutputStream(
                        new FileOutputStream(filepath)
                )
                ){
            for (String line : lines) {
                byte[] buffer = (line + "\n").getBytes(charset);
                bos.write(buffer, 0, buffer.length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyWithFilesClass (String from, String newFileName) {
        Path fromPath = Paths.get(from);
        Path toPath = fromPath.getParent().resolve(Paths.get(newFileName));

        try {
            Files.copy(fromPath, toPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //  💡 Files의 copy 메소드
    //  - 내부적으로 Buffered...Stream 사용
    //  - 보다 간결한 코드, 예외 처리 등 내부 처리 구현
    //  - 실무에서 보다 권장
}
