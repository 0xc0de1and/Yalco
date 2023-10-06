package sec01.chap03.ex08;


import jdk.jshell.Snippet;
import sec01.chap03.ex07.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ints1 = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();
        ArrayList<Knight> knights = new ArrayList<>();

        ints1.add(11);
        ints1.add(22);
        ints1.add(33);
        ints1.add(44);
        ints1.add(55);

        for (String str : "바니 바니 바니 바니 당근 당근".split(" ")){
            strings.add(str);
        }

        for (int i : ints1){
            System.out.println(i);
        }

        int int1Size = ints1.size();
        boolean ints1IsEmpty = ints1.isEmpty();
        int ints12nd = ints1.get(1);
        boolean ints1Con3 = ints1.contains(33);
        boolean intsCon6 = ints1.contains(66);

        ints1.set(2, 444);
        ints1.add(0, 11);


        ArrayList<Integer> ints2A = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );

        ArrayList<Integer> ints2B = new ArrayList<>(
                List.of(1, 2, 3, 4, 5)
        );

        ArrayList<Integer> ints2C = new ArrayList<>();
        Collections.addAll(ints2C, 1, 2, 3, 4, 5);

        ArrayList<Integer> ints3 = new ArrayList<>(ints1);

        ints3.remove(4);
        ints3.remove((Integer) 55);
        ArrayList<Integer> test1 = new ArrayList<>(
                List.of(1, 2, 3, 4, 5, 6)
        );
        ArrayList<Integer> test2 = new ArrayList<>(
                List.of(1, 2, 3, 4, 5)
        );

        test1.removeAll(test2);

        Object[] intAry2_Obj = ints1.toArray();
        numbers.add(Integer.valueOf(123));
        numbers.add(3.14);
        numbers.add(1);
//        numbers.add("ㅎㅇ");

//        knights.add(new Swordman(Side.BLUE));
        knights.add(new Knight(Side.BLUE));
        knights.add(new MagicKnight(Side.RED));

        ArrayList<? extends Knight> eliteSquad;
//        eliteSquad = new ArrayList<Swordman>();
        eliteSquad = new ArrayList<Knight>();
        eliteSquad = new ArrayList<MagicKnight>();

        Knight knight1 = new Knight(Side.RED);
        knights.add(knight1);

        boolean removed1 = knights.remove(new Knight(Side.RED));
        boolean removed2 = knights.remove(knight1);

        ArrayList<Attacker> attackers = new ArrayList<>();
        attackers.ensureCapacity(5);
        attackers.trimToSize();

        LinkedList<Character> charList = new LinkedList<>();

        charList.push('A');
        charList.push('B');
        charList.push('C');
        charList.push('D');
        charList.push('E');

        char pop1 = charList.pop();
        char pop2 = charList.pop();
        char pop3 = charList.pop();


    }
}
