package sec01.chap01.ex11;

public class YalcoChicken {
    static String brand = "얄코치킨";
    static String contact() {
        return ("%s입니다. 무엇을 도와드릴까요?").formatted(
                brand
        );
    }

    static int lastno;
    int no = lastno++;
//    int no = lastno++;
    String name;

    YalcoChicken (String name){
        no++;
        this.name = name;
    }

    String intro() {
        return ("이 곳은 %s %d호점 입니다.").formatted(
                no, name
        );
    }


    static String a = "마나";
    String s = "ㅁs"; // 이것은 Main에서 호출 불가능
}
