package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	LocalTime now = LocalTime.now();
	String isNow = now.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        System.out.println(isNow);
        //ZonaDateTime
    LocalDate nowDate = LocalDate.now();
    LocalTime nowTime = LocalTime.now();
    ZoneId zone = ZoneId.of("Europe/London");
        ZonedDateTime LondonTime = ZonedDateTime.of(nowDate, nowTime, zone);
        System.out.println(LondonTime);
        //Конвертация ZonedDateTime между зонами
        ZonedDateTime NYtime = LondonTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime JapanTime = LondonTime.withZoneSameInstant(ZoneOffset.of("-09:00"));
        System.out.println("New_Your/Tokyo Time");
        System.out.println(NYtime);
        System.out.println(JapanTime);
    }
}
