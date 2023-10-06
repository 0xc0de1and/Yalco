package sec01.chap03.ex11;

import sec01.chap03.ex07.*;

import java.util.Comparator;

public class UnitSorter implements Comparator<Unit> {

    public int getClassPoint (Unit u) {
        int result = u.getSide() == Side.RED ? 1 : 0;

        if (u instanceof Swordman) result += 1;
        if (u instanceof Knight) result += 2;
        if (u instanceof MagicKnight) result += 3;

        return result;
    }

    @Override
    public int compare(Unit o1, Unit o2) {
        var result = getClassPoint(o2) - getClassPoint(o1);
        if (result == 0) result = o1.hashCode() - o2.hashCode();
        return result;
    }
}
