package sec01.chap03.ex04;

public class Main {
    public static void main(String[] args) {
        String strSample = "Ab가1 .";
        for (int i = 0; i < strSample.length(); i++) {
            Character c = strSample.charAt(i);
            System.out.printf(
                    "[%c] : L: %b, U: %b, L: %b, D: %b, S: %b%n",
                    c,
                    Character.isLetter(c),
                    Character.isUpperCase(c),
                    Character.isLowerCase(c),
                    Character.isDigit(c),
                    Character.isSpaceChar(c)
                    );
        }

        Integer int1 = Integer.valueOf("123");
        String intStr = int1.toString();

    }
}
