package sec03.ex02;

@ClassDesc("자기소개")
public class Introduction {
    @Blind
    @MaxLength(4)
    private String name;

    @NumLimit(type = LimitType.MIN, to = 1)
    private int age;

    @MaxLength
    private String job;

    @MaxLength(50)
    private String description;

    public Introduction(String name, int age, String job, String description) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.description = description;
    }

    @TestAndPrint(a = "- - - 이상 간략 소개입니다. - - -")
    public void shortPrint () {
        System.out.printf(
                "%s (%d대 %s)%n",
                name, age, job
        );
    }

    public void fullPrint() {
        StringBuilder sb = new StringBuilder();
        sb.append("이름 : %s%n".formatted(name));
        sb.append("나이 : %s대%n".formatted(age));
        sb.append("직업 : %s%n".formatted(job));
        System.out.println(sb.toString());
    }
}
