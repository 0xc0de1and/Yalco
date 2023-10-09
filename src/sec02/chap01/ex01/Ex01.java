package sec02.chap01.ex01;

import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static final String CUR_PATH = "src/sec02/chap01/ex01/";

    public static void main(String[] args) {
        var filePath = "file1.txt";
        filePath = CUR_PATH + filePath;
        File file1 = new File(filePath);
        System.out.println(file1.exists());

        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                System.out.println("파일 생성 실패");
                throw new RuntimeException(e);
            }
        }
        var fileExist = file1.exists();
        var file1Name = file1.getName();
        var fileIsfile = file1.isFile();
        var fileIsDir = file1.isDirectory();
        var fileLength = file1.length();

        var file1AbsPath = file1.getAbsolutePath();
        var file1CnnPath = ""; // 절대경로

        try {
            file1CnnPath = file1.getCanonicalPath();
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        var file2 = new File(
                file1CnnPath.replace("file1.txt", "file2.txt")
        );
        try {
            boolean result = file2.createNewFile();
            System.out.println(result ? "파일 생성됨" : "이미 있음");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
