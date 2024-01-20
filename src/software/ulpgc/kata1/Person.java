package software.ulpgc.kata1;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge() {
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    public int toYears(long days){
        return (int) (days/365.25);
    }

    @Override
    public String toString(){
        return String.format("%s nació en %s, por lo que tiene %d años.", name, birthday,getAge());
    }
}
