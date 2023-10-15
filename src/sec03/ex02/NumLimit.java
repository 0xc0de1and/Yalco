package sec03.ex02;


import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Repeatable(NumLimits.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface NumLimit {
    LimitType type();
    int to();
}
