package sec01.chap04.ex10;

import sec01.chap03.ex07.Side;
import sec01.chap03.ex07.Unit;

public class Dragon extends Unit {

    public Dragon(Side side) {
        super(side, 3000);
    }

    @Override
    public String toString() {
        return side.toString() + " 진영 드래곤";
    }
}
