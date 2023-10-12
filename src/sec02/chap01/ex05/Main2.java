package sec02.chap01.ex05;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main2 {
    public static String PEOPLE_PATH = "src/sec02/chap01/ex05/people.ser";

    public static void main(String[] args) {
        Person person1Out;
        Person person2Out;
        List<Person> peopleOut;

        try (
                FileInputStream fis = new FileInputStream(PEOPLE_PATH);
                BufferedInputStream bis = new BufferedInputStream(fis);
                ObjectInputStream ois = new ObjectInputStream(bis);
                ){
            person1Out = (Person) ois.readObject();
            person2Out = (Person) ois.readObject();
            peopleOut = (ArrayList) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(person1Out);
        System.out.println(person2Out);
        System.out.println(peopleOut);
    }
}
