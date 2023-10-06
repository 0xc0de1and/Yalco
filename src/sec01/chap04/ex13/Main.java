package sec01.chap04.ex13;

import sec01.chap04.ex11.WrongMonthException;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> dutyRegmap = new HashMap<>();
        dutyRegmap.put("정핫훈", 3);
        dutyRegmap.put("김돌준", 8);

        dutyRegmap.forEach((name, month) -> {
            try {
                chooseDutyMonth(name, month);
            } catch (WrongMonthException we) {
                we.printStackTrace();
                System.out.printf("%s씨 해보자는 거지?%n", name);
            } catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    public static void chooseDutyMonth (String name, int index) throws WrongMonthException{
        int[] availables = {1, 3, 4, 7, 9, 12};

        try {
            int month = availables[index - 1];
            System.out.printf("%s씨 %d월 담당으로 배정되셨어요.%n", name, month);
        } catch (ArrayIndexOutOfBoundsException ae) {
            WrongMonthException we = new WrongMonthException(
                    "%d번은 없어요.".formatted(index)
            );
//            we.initCause(ae);
            throw we;
        }
    }
}
