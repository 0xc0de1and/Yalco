package sec01.chap01.ex17;

public class Slime {
    protected int hp = 40;
    protected int attack = 5;
    protected int deffence = 1;

    public void attack(Slime enemy){
        enemy.hp -=(attack - deffence);
    }

}
