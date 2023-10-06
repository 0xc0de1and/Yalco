package sec01.chap03.ex05;

public class Main {
    public static void main(String[] args) {
        var array1 = new Double[] {
                1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8
        };

        var array2 = new Character[] {
             'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'
        };

        arraySwap(array1, 3, 5);

        for (int i = 0; i < 100; i++) {
            arraySwap(
                    array2,
                    (int)Math.floor(Math.random() * array2.length),
                    (int)Math.floor(Math.random() * array2.length)
                    );
        }

        Pocket<Double, Double, Double> size3d1= new Pocket<>(123.45, 234.2, 12.0);
        double height = size3d1.getFieldA();
        var width = size3d1.getFieldB();
        double depth = size3d1.getFieldC();

        Pocket<String, Double, Integer> test = new Pocket<>("ㅎㅇ", 123.2, 3);
        Pocket<Integer, Integer, Integer>[] arrtest = new Pocket[]{
                new Pocket<>(1, 1, 1),
                new Pocket<>(1, 1, 1),
                new Pocket<>(1, 1, 1),
        };

    }
    public static <T> T pickRandom(T a, T b){
        return Math.random() > 0.5 ? a : b;
    }

    int randNum = pickRandom(123, 456);
    boolean randBool = pickRandom(true, false);
    String randStr = pickRandom("푸", "푸우우");

    public static <T> void arraySwap(T[] array, int a, int b ){
        if (array.length <= Math.max(a, b)) return;
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
