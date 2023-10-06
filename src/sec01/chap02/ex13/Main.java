package sec01.chap02.ex13;

public class Main {
    public static void main(String[] args) {
        Child child1 = new Child("홍길동", 2021, Gender.MALE);
        String childStr = child1.toString();

        var children = new Child[]{
                new Child("김순이", 2021, Gender.FEMALE),
                new Child("이돌이", 2019, Gender.MALE),
                new Child("박철수", 2020, Gender.MALE),
                new Child("최영희", 2019, Gender.FEMALE),
        };

        for (var test : children){
            System.out.println(test.toString());
        }
    }
}
