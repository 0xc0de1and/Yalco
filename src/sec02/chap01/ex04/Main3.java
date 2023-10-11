package sec02.chap01.ex04;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        String input = "반~갑구만,\n반~가워요!\n반~갑구만,\n반~갑습니다~!";
        String output;

        try (
                StringReader sr = new StringReader(input);
                StringWriter sw = new StringWriter();
                ){
            int c;
            while ((c = sr.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println();

            sw.write("어쩔티비");
            sw.write(" ");
            sw.write("저쩔티비");
            output = sw.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(output);

        System.out.println();

        String csvTxt = ""
                + "1, 2, 3, 4, 5\n"
                + "6, 7, 8, 9, 10\n"
                + "11, 12, 13, 14, 15\n"
                + "16, 17, 18, 19, 20\n"
                + "21, 22, 23, 24, 25"
                ;

        List<Integer[]> fromCsv = new ArrayList<>();

        try (
                StringReader sr = new StringReader(csvTxt);
                BufferedReader br = new BufferedReader(sr);
                ) {
            String line;
            while ((line = br.readLine()) != null) {
                fromCsv.add(
                        Arrays.stream(
                                line.replace(" ", "").split(",")
                        ).map(Integer::parseInt)
                                .toArray(Integer[]::new)
                );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Charset charset = StandardCharsets.UTF_8;
        String CSV_PATH = "src/sec02/chap01/ex04/numbers.csv";

        try (
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw);
                FileWriter fw = new FileWriter(CSV_PATH, charset);
                BufferedWriter bw = new BufferedWriter(fw)
                ){
            fromCsv.stream()
                    .map(intArr -> Arrays.stream(intArr)
                    .map(i -> i * i)
                            .toArray(Integer[]::new)
                    ).forEach(array -> {
                        pw.printf(
                                "%d, %d, %d, %d, %d",
                                array
                        );
                        pw.println();
                    });
            String result = sw.toString();
            System.out.println(result);
            bw.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //  ⭐️ System의 out은 기본적으로 PrintStream 임 확인
        System.out.println(System.out.getClass());

        String PRINT_PATH = "src/sec02/chap01/ex04/print.txt";

        PrintStream ps = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(PRINT_PATH);
            ps = new PrintStream(fos);

            //  💡 System의 out 변경
            //  - FileOutputStream 을 출력 대상으로 하는
            //  - 새 PrintStream으로
            System.setOut(ps);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("안녕히 계세요 여러분.");
        System.out.printf("%s로 뵙겠습니다.%n", "텍스트파일");
    }
}
