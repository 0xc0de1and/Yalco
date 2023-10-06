package sec01.chap01.ex08;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 7, 8, 9, 10};

        IntArrayInfo intarr1 = new IntArrayInfo(arr1);
        IntArrayInfo intarr2 = new IntArrayInfo(arr2);

        int ary1Max = intarr1.max;
        int ary2Max = intarr2.max;
    }
}
