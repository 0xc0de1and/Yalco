package sec01.chap01.ex07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Slime slime1 = new Slime();
        Slime slime2 = new Slime();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("공격 : Z, 넘어가기 : X");
        String order = br.readLine();

        if (order.equals("Z")){
            System.out.println(slime1.attack);
        }

    }

}
