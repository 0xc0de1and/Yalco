package sec01.chap03.ex12;

public class Person implements Comparable<Person> {
    private static int lastNo = 0;
    private int no;
    private String name;
    private int age;
    private double height;

    public Person(int no, String name, int age, double height) {
        this.no = ++lastNo;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }

    public String toString() {
        return "Person{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}