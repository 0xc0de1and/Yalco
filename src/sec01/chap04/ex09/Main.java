package sec01.chap04.ex09;

public class Main {
    public static void main(String[] args) {
            registerDutyMonth("김돌준", 13);
    }

    public static void registerDutyMonth (String name, int month) {
        if (month < 1 || month > 12) {
            throw new WrongMonthException(month);
        }
        System.out.printf("%s씨 %d월 담당으로 배정되셨어요.%n", name, month);
    }
}
