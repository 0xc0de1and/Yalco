package sec01.chap01.practice;

public class Exam {
    int testint = 1;
    static int statictestint = 3;

    public static int test1(){
        statictestint++;
        System.out.printf("StaticInt : %d%n",statictestint);
//        testint++; 못씀
        return statictestint;
    }

    public int test2(int a, int b){
        statictestint++;
        testint++;
        System.out.printf("StaticInt : %d%n",statictestint);
        System.out.printf("Int : %d%n", testint);
        return statictestint;
    }

    public void test3() {
        testint++;
        statictestint++;
        System.out.printf("StaticInt : %d%n", statictestint);
        System.out.printf("Int : %d%n", testint);
    }

    public static void test4() {
//        testint++;
        statictestint++;
        System.out.printf("StaticInt : %d%n", statictestint);
//        System.out.printf("Int : ", testint);
    }
}
