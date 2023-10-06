package sec01.chap03.ex12;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet[] treeSets = {
                new TreeSet<>(),
                new TreeSet<>(new PersonComp(PersonComp.SortBy.NO, PersonComp.SortDir.DESC))
        };

//        for (var p : new Person[] {
//
//        }
    }
}
