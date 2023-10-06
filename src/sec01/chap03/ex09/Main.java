package sec01.chap03.ex09;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> intHSet1 = new HashSet<>();
        intHSet1.add(1);
        intHSet1.add(1);
        intHSet1.add(2);
        intHSet1.add(3);

        List<Integer> ints1 = new ArrayList<>(
                Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 6, 7)
        );

        Set<Integer> intHset2 = new HashSet<>(ints1);

        for (var i : intHSet1){
            System.out.println(i);
        }

        ints1.clear();
        ints1.addAll(intHset2);


        Set<Integer> intHashSet = new HashSet<>();
        Set<Integer> intLinkedHashSet = new LinkedHashSet<>();
        Set<Integer> intTreeHashSet = new TreeSet<>();

        for (var i : new int[] {9, 8, 7, 6, 5, 4, 3, 1, 2}){
            intHashSet.add(i);
            intLinkedHashSet.add(i);
            intTreeHashSet.add(i);
        }

        for (var i : new Set[] {intHashSet, intLinkedHashSet, intTreeHashSet}){
            System.out.println(i);
        }

        Set<String> strHashSet = new HashSet<>();
        Set<String> strLinkedHashSet = new LinkedHashSet<>();
        Set<String> strTreeSet = new TreeSet<>();

        for (String s : new String[] {
                "Fox", "Banana", "Elephant", "Car", "Apple", "Game", "Dice"
        }) {
            strHashSet.add(s);
            strLinkedHashSet.add(s);
            strTreeSet.add(s);
        }
        for (var s : new Set[] {strHashSet, strLinkedHashSet, strTreeSet}) {
            System.out.println(s);
        }
    }
}
