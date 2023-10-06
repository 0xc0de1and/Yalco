package sec01.chap04.ex10;

import sec01.chap03.ex07.MagicKnight;
import sec01.chap03.ex07.Side;
import sec01.chap03.ex07.Unit;

public class Main {
    public static void superLighteningAttack (MagicKnight magicKnight, Unit enemy) {
        final int MANA_USAGE = 40;
        final int DAMAGE = 500;
        if (magicKnight.mana < MANA_USAGE) {
            throw new NothEnoughManaException(magicKnight, MANA_USAGE);
        }
        System.out.printf("%s에게 번개공격,%n", enemy);
        enemy.hp -= DAMAGE;
        magicKnight.mana -= MANA_USAGE;
    }
    public static void main(String[] args) {
        MagicKnight hightempler = new MagicKnight(Side.RED);
        Dragon dragoon = new Dragon(Side.BLUE);

        superLighteningAttack(hightempler, dragoon);
        superLighteningAttack(hightempler, dragoon);
    }
}
