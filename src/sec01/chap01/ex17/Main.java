package sec01.chap01.ex17;

public class Main {
    public static void main(String[] args) {
        Slime slime1 = new Slime();
        FireSlime slime2 = new FireSlime();
        slime1.attack(slime2);
        slime2.attack(slime1);

        System.out.printf(
                "기본 슬라임 Hp : %d, 공격력 : %d, 방어력 :%d%n"
                ,slime1.hp, slime1.attack, slime1.deffence
        );

        System.out.printf(
                "파이어 슬라임 Hp : %d, 공격력 : %d, 방어력 :%d"
                ,slime2.hp, (slime1.attack + slime2.firedamage), slime2.deffence
        );
    }
}
