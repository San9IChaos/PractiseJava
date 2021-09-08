package com.company;

import java.sql.SQLOutput;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
	Optional<String> name = Optional.of("John");
	name.ifPresent(val -> System.out.println(val));
    Optional<String> nuLL = Optional.ofNullable(null);
    nuLL.ifPresent(val -> System.out.println(val));
    Optional<String> name1 = Optional.of("Sasha");
    if(name1.isPresent()){
        System.out.println(name1.get());
    }
        System.out.println(name1.orElseGet(() -> "blank"));
        System.out.println(nuLL.orElseGet(()-> "blank1"));
        Optional<String> name2 = Optional.of("JOHN");
        System.out.println(name2.map(String::toLowerCase));
        Optional<Optional<String>> name3 = Optional.of(Optional.of("VALERA"));
        Optional<String> toLowerCase = name3.flatMap(p -> p.map(String::toLowerCase));
        System.out.println(toLowerCase);
    }
}
