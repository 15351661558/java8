package com.picc.lpl.methodReference;

import com.picc.lpl.vo.Person;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodTest {

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("tom", LocalDate.of(2000, 5, 10)),
                new Person("kity", LocalDate.of(2005, 10, 20)),
                new Person("jack", LocalDate.of(1995, 2, 13)));
//        list.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return p1.getBirthday().compareTo(p2.getBirthday());
//            }
//        });
//        System.out.println(list);

//        list.sort((p1,p2)->{
//            return p1.getBirthday().compareTo(p2.getBirthday());
//        });
//        System.out.println(list);

//        list.sort((p1,p2)->{
//            return Person.comparaeByBirthday(p1,p2);
//        });
//        System.out.println(list);

//        list.sort(Person::comparaeByBirthday);
//        System.out.println(list);

        list.forEach((p)->{
            System.out.println(p);
        });

        System.out.println();

        list.forEach(System.out::println);

    }

}
