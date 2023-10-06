package sec01.chap03.ex10;

import sec01.chap03.ex07.*;

import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> numNameMap = new HashMap<>();
        numNameMap.put(1, "홍길동");
        numNameMap.put(2, "전우치");
        numNameMap.put(3, "임꺽정");

        Map<String, Double> nameHeightHMap = new HashMap<>();
        nameHeightHMap.put("김철수", 176.8);
        nameHeightHMap.put("이장신", 187.4);
        nameHeightHMap.put("박숏달", 152.3);
        nameHeightHMap.put("정기준", 171.2);

        Map<Side, ArrayList<Unit>> sideUnitHMap = new HashMap<>();
        sideUnitHMap.put(
                Side.BLUE,
                new ArrayList<>(
                        Arrays.asList(
                                new Swordman(Side.BLUE),
                                new Knight(Side.BLUE),
                                new MagicKnight(Side.BLUE)
                        )
                )
        );

        sideUnitHMap.put(
                Side.RED,
                new ArrayList<>(
                        Arrays.asList(
                                new Knight(Side.RED),
                                new Knight(Side.RED),
                                new Knight(Side.RED)
                        )
                )
        );

        Map<Integer, String> numNampHMapClone = new HashMap<>();
        numNampHMapClone.putAll(numNameMap);

        String no2 = numNampHMapClone.get(2);
        Double leeHeight = nameHeightHMap.get("이장신");
//        잘못된 키 반환 시, null 반환

        Set<Integer> numSet = numNameMap.keySet();
        Set<Integer> numHSet = new HashSet<>();
        numHSet.addAll(numSet);

        for (var n : numNameMap.keySet()){
            System.out.println(numNameMap.get(n));
        }

        System.out.println("=====================");

        Map<Side, ArrayList<Unit>> test2 = new HashMap<>();
        test2.put(
                Side.RED,
                new ArrayList<>(
                        Arrays.asList(
                                new Knight(Side.RED)
                        )
                )
        );
        Set<Side> test = sideUnitHMap.keySet();

        for (var side : sideUnitHMap.keySet()){
            for (var unit : sideUnitHMap.get(side)){
                System.out.println(unit);
            }
        }

        Boolean contains1 = nameHeightHMap.containsKey("이장신");
        Boolean contains2 = nameHeightHMap.containsKey("메렁");
        Boolean contains3 = nameHeightHMap.containsValue(171.2);

        System.out.println("------------------------------");

        Map<Attacker, Horse> atkrHrsHMap = new HashMap<>();
        Swordman kenshin = new Swordman(Side.RED);
        Knight lancelot = new Knight(Side.BLUE);

        atkrHrsHMap.put(kenshin, new Horse(40));
        atkrHrsHMap.put(lancelot, new Horse(50));
        atkrHrsHMap.put(new MagicKnight(Side.BLUE), new Horse(60));

        Horse kenshinHorse = atkrHrsHMap.get(kenshin);
        Horse lancelotHorse = atkrHrsHMap.get(lancelot);
        Horse wrongHorse = atkrHrsHMap.get(new MagicKnight(Side.BLUE));

        for (var u : atkrHrsHMap.keySet()){
            System.out.println(u + " : " + atkrHrsHMap.get(u));
        }

        System.out.println(atkrHrsHMap.get(kenshin));

        String defName = numNameMap.getOrDefault(10, "김대타");
        Horse defHorse = atkrHrsHMap.getOrDefault(new MagicKnight(Side.BLUE), new Horse(50));

        Set<Map.Entry<Integer, String>> numNameES = numNameMap.entrySet();
        for (var entry : numNameES){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("k : %d, v : %s%n", key, value);
            System.out.println(entry);
        }

        numNameMap.remove(1);
        boolean teset23 = numNameMap.remove(2, "황대장");

        boolean isEmpty1 = nameHeightHMap.isEmpty();
        nameHeightHMap.clear();
        boolean isEmpty2 = nameHeightHMap.isEmpty();

        TreeMap<Integer, String[]> classKidsTMap = new TreeMap<>();
        classKidsTMap.put(3, new String[]{"서아", "이준", "아린"});
        classKidsTMap.put(1, new String[]{"하윤", "서준", "지호"});
        classKidsTMap.put(5, new String[]{"ㅁ", "ㅇ", "ㅇ", "ㄹ"});

        int firstKey = classKidsTMap.firstKey();
        int lasKey = classKidsTMap.lastKey();

        Map.Entry<Integer, String[]> firstEntry = classKidsTMap.firstEntry();

        int ceil4 = classKidsTMap.ceilingKey(4);
        Map.Entry<Integer, String[]> floor4 = classKidsTMap.floorEntry(4);

        Map.Entry<Integer, String[]> pollF1 = classKidsTMap.pollFirstEntry();
        Map.Entry<Integer, String[]> pollF2 = classKidsTMap.pollLastEntry();
        Map.Entry<Integer, String[]> pollL1 = classKidsTMap.pollLastEntry();
        Map.Entry<Integer, String[]> pollL2 = classKidsTMap.pollLastEntry();
    }
}
