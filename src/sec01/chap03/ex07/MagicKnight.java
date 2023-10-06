package sec01.chap03.ex07;

public class MagicKnight extends Knight{
    public int mana = 60;

    public int getMana() {
        return mana;
    }

    public final int MANA_USAGE = 4;

    public MagicKnight(Side side) {
        super(side);
    }

    public void lightningAttack(Unit[] target){
        for (Unit targets : target){
            if (targets instanceof MagicKnight) continue;
            if (mana < MANA_USAGE) break;
            System.out.printf("⚡️ → 💀 %s%n", target);
            targets.hp -= 8;
            mana -= MANA_USAGE;
        }
    }

    @Override
    public String toString(){
        return side.toString() + "진영마법기사";
    }
}
