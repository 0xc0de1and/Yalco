package sec01.chap04.ex10;

import sec01.chap03.ex07.MagicKnight;

public class NothEnoughManaException extends RuntimeException {
    public NothEnoughManaException(MagicKnight mk, int needMana) {
        super(
                "마나가 %d 부족합니다."
                        .formatted(needMana - mk.getMana())
        );
    }
}
