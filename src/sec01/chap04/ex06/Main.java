package sec01.chap04.ex06;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] names = {
                "강백호", "서태웅", "채치수", "송태섭", "정대만",
                "윤대협", "변덕규", "황태산", "안영수", "허태환",
                "이정환", "전호장", "신준섭", "고민구 ", "홍익현",
                "정우성", "신현철", "이명헌", "최동오", "정성구"
        };

        Stream<String> nameStream = Arrays.stream(names);
        Random random = new Random();
        random.setSeed(4);
        var people = nameStream
                .map(name -> new Person(
                        name,
                        random.nextInt(18, 35),
                        random.nextDouble(160, 190),
                        random.nextBoolean()
                ))
                .sorted((p1, p2) -> p1.getHeight() > p2.getHeight() ? 1 : -1)
                .toList();

        var peopleLastnameSet = people.stream()
                .map(i -> i.getName().charAt(0))
                .collect(Collectors.toList());

        var peopleHMapByMarried = people.stream()
                .collect(Collectors.groupingBy(Person::isMarried));
        var married = peopleHMapByMarried.get(true);

        var peopleHMapByHeight = people.stream()
                .collect(Collectors.groupingBy(
                        p -> ((int) p.getHeight() / 10) * 10)
                );
        var over180s = peopleHMapByHeight.get(180);

        DoubleSummaryStatistics heightStats = people.stream()
                .map(Person::getHeight)
                .collect(Collectors.summarizingDouble(Double::doubleValue));
        var test = heightStats.getAverage();
    }
}
