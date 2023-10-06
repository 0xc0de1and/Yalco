package sec01.chap03.ex13;

import sec01.chap03.ex07.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> intHSet = new HashSet<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
        );

        Iterator<Integer> intItor = intHSet.iterator();
        Integer int1 = intItor.next();
        Integer int2 = intItor.next();
        Integer int3 = intItor.next();

        boolean hasNext = intItor.hasNext();

        intItor = intHSet.iterator();

        while (intItor.hasNext()){
            if (intItor.next() % 3 == 0){
                intItor.remove();
            }
        }

        List<Unit> enemies = new ArrayList<>(
                Arrays.asList(
                        new Swordman(Side.RED),
                        new Knight(Side.RED),
                        new Swordman(Side.RED),
                        new Swordman(Side.RED),
                        new Knight(Side.RED),
                        new Knight(Side.RED),
                        new Swordman(Side.RED),
                        new MagicKnight(Side.RED),
                        new Swordman(Side.RED),
                        new MagicKnight(Side.RED),
                        new Knight(Side.RED),
                        new MagicKnight(Side.RED))
                );
        Iterator<Unit> enemyItor = enemies.iterator();

        var thunderBolts = 3;
        var fireBalls = 4;

        while (enemyItor.hasNext() && thunderBolts-- > 0){
            var enemy = enemyItor.next();
            enemy.hp -= 50;
        }

        while (enemyItor.hasNext() && fireBalls-- > 0){
            var enemy = enemyItor.next();
            System.out.printf("%s 파이어 볼 공격%n",enemy);
            enemy.hp -= 30;
        }

        while (enemyItor.hasNext()) {
            var enemy = enemyItor.next();
            System.out.printf("%s 화살공격%n",enemy);
            enemy.hp -= 10;
        }

        System.out.println("--------------------------");

        Map<Integer, Double> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put(i +1, Math.random() * 10);
        }

        Iterator<Integer> hmKeyItor = hashMap.keySet().iterator();
        Iterator<Double> hmValueItor = hashMap.values().iterator();
        Iterator<Map.Entry<Integer, Double>> hmentryItor = hashMap.entrySet().iterator();

        while (hmKeyItor.hasNext()) {
            System.out.println(hmKeyItor.next());
        }
        System.out.println("==========================");

        while (hmValueItor.hasNext()){
            System.out.println(hmValueItor.next());
        }
        System.out.println("=========================");

        while (hmentryItor.hasNext()) {
            System.out.println(hmentryItor.next());
        }

        while (hmKeyItor.hasNext()) {
            int i = hmKeyItor.next();
            if (i % 3 == 0) hmKeyItor.remove();
        }
    }
}
