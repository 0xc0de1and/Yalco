package sec02.chap01.ex05;

import java.io.Serializable;

public class Career implements Serializable {
    private static final long serialVersionUID = 1L;
    private String company;
    private int year;

    public Career(String company, int year) {
        this.company = company;
        this.year = year;
    }
}
