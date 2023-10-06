package sec01.chap01.ex17;

public class FireSlime extends Slime{
    protected int firedamage = 10;

    @Override
    public void attack(Slime enemy){
        enemy.hp -=(attack + firedamage - deffence);
    }
}
