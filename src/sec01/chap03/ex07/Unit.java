package sec01.chap03.ex07;

public abstract class Unit {
    public Side side;
    public int hp;

    public Unit(Side side, int hp) {
        this.side = side;
        this.hp = hp;
    }

    public Side getSide() {
        return side;
    }
}
