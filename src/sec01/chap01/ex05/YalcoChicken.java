package sec01.chap01.ex05;

public class YalcoChicken {
    int no;
    String name;

    String intro(){
        return "안녕하세요, %d호 %s점 입니다."
                .formatted(no, name);
    }
}
