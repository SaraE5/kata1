package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sara", LocalDate.of(2000,6,17));
        System.out.println(person);
    }
}
