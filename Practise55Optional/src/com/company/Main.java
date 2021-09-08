package com.company;

import java.util.Locale;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        /*Optional<String> hello = Optional.ofNullable(null);
        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());
        hello.ifPresentOrElse(System.out::println, () -> System.out.println("World"));*/
        //Способ 1
        Person sergey = new Person("Сергей","sergey@mail.com");
        String email = sergey
                .getEmail()
                .map(String::toLowerCase)
                .orElse("у " + sergey.getName() + " нет почты");
        System.out.println(email);
        //Способ 2
//        if(sergey.getEmail().isPresent()){
//            String email1 = sergey.getEmail().get();
//            System.out.println(email1.toLowerCase());
//        }
//        else{
//            System.out.println("У Сергея нет почты");
//        }
    }
}
class Person {
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
