package com.company;

public class Main {

    public static void main(String[] args) {
        /*
            \\d - одна цифра
            \\w - одна буква
            \\w - [a-zA-Z]

            \\d+ - 1 или более
            \\d* - 0 или более
            ?\\d - 0 или 1 символов до (-)

            (x|y|z|) - одна из множества строк

            [abc] = (a|b|c)
            [a-zA-Z] - все английские буквы
            [0-9] - \\d
            [^abc] - все символы, кроме [abc]

            . - любой символ

            {2} - 2 символа до (\\d{2})
            {2, } - 2 или более символа (\\d{2,})
            {2, 4} - от 2 до 4 символов (\\d{2,4})
         */
        String a = "-52412";
        String b = "52412";
        String c = "+12124";

        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "aqwFagAftr12351615";
        System.out.println(d.matches("[a-zA-Z31]+\\d+"));

        String e = "hello";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        String url3 = "Hello there!";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url3.matches("http://www\\..+\\.(com|ru)"));

        String f = "123";
        System.out.println(f.matches("\\d{2,}"));
    }
}
