package sec01.chap01.ex07;

public class Slime {

    double hp = 40;
    int attack = 8;
    double defence = 0.2;

    double attack(Slime enemy){
        return attack * (1 - defence);
    }
}
