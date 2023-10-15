package sec03.ex02;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface WeekDaysAvail {
    WeekDay[] value();
}
