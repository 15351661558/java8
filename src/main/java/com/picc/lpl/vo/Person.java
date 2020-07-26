package com.picc.lpl.vo;

import java.time.LocalDate;

public class Person{

    private String name;
    private LocalDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person() {
    }

    public static int comparaeByBirthday(Person p1,Person p2){
        return p1.birthday.compareTo(p2.birthday);
    }



}


