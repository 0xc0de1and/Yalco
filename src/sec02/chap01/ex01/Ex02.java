package sec02.chap01.ex01;

import java.io.File;

public class Ex02 {
    public static void main(String[] args) {
        var newName = "test.txt";
        var file2 = new File(Ex01.CUR_PATH + "name_changed.txt");
        var nameChange = new File(Ex01.CUR_PATH + newName);

        var renameResult = file2.renameTo(nameChange);
        System.out.println(renameResult ? "이름 변경됨" : "해당 파일없음");
        boolean deleteResult = nameChange.delete();
        System.out.println(deleteResult ? "삭제됨" : "해당 파일 없음");
    }
}
