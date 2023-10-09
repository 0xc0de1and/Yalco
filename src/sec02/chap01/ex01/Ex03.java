package sec02.chap01.ex01;

import java.io.File;
import java.io.IOException;
import java.util.stream.IntStream;

public class Ex03 {
    public static void main(String[] args) {
        var folderName = "myFolder";
        File folder = new File(Ex01.CUR_PATH + folderName);

        boolean folderMade = folder.mkdir();

        boolean isFile = folder.isFile();
        boolean isDir = folder.isDirectory();

        IntStream.range(0, 10).forEach(i -> {
            try {
                if (i % 3 == 0) {
                    new File(
                            "%s%s/folder%d"
                             .formatted(Ex01.CUR_PATH, folderName, i + 1)
                    ).mkdir();
                    return;
                }
                new File(
                        "%s%s/file%d.txt"
                                .formatted(Ex01.CUR_PATH, folderName, i + 1)
                ).createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        var filesInFolder = folder.listFiles();
        String[] fileNamesInFolder = folder.list();

        for (var item : fileNamesInFolder) {
            System.out.println(
                    (item.contains("r") ? " 📁" : "📄")
                            + " " + item
            );
        }
    }
}
