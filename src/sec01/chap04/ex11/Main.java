package sec01.chap04.ex11;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> dutyTegMap = new HashMap<>();
//        dutyTegMap.put("정핫훈", 7);
        dutyTegMap.put("김돌준", 13);

//        dutyTegMap.forEach((name, month) -> {
//            try {
//                registerDutyMonth(name, month);
//            } catch (WrongMonthException we) {
//                we.printStackTrace();
//                System.out.printf("%s씨 에어팟 빼봐요.%n", name);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });

        dutyTegMap.forEach((name, month) -> {
            try {
                registerDutyMonthSafer(name, month);
            } catch (WrongMonthException we) {
                we.printStackTrace();
                System.out.println("왜불렀게");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

//    public static void registerDutyMonth (String name, int month) throws WrongMonthException {
//        if (month < 1 || month > 12) {
//            throw new WrongMonthException("직원교육");
//        }
//        System.out.printf("%s씨 %d월 담당으로 배정되셨어요%n", name, month);
//    }

    public static void registerDutyMonthSafer (String name, int month) throws WrongMonthException {
        try {
            if (month < 1 || month > 12) {
                throw new WrongMonthException(
                        "저희가 아무 달에 배정할게요."
                );
            }
            System.out.printf("%s씨 %d월 담당으로 배정되셨어요z.%n",name,month);

        } catch (WrongMonthException we) {
            System.out.printf("%s씨 %d월 담당으로 배정되셨어요.%n",
                    name, new Random().nextInt(1, 13));
            throw we;
        }
    }

}
