package com.company;

import java.sql.SQLOutput;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
	LocalDate.of(2021, Month.AUGUST,12);
	LocalDate.of(2021,8,12);
	LocalDate.ofYearDay(2021,255);
	LocalDateTime.of(2021,Month.AUGUST,12,15,36);
	LocalDate now = LocalDate.now();
	LocalDate plus2days = now.plusDays(2);
	LocalDate plusWeek = now.plusWeeks(1);
	LocalDate plus3Month = now.plusMonths(3);
	LocalDate plusPeriod = now.plus(Period.ofDays(3));
	LocalDate plusMillennia = now.plus(1, ChronoUnit.MILLENNIA);
	LocalDate minus2days = now.minusDays(2);
	LocalDate minusWeek = now.minusWeeks(1);
	LocalDate minus3Month = now.minusMonths(3);
	LocalDate minusPeriod = now.minus(Period.ofDays(3));
	LocalDate minusMillennia = now.minus(1, ChronoUnit.MILLENNIA);
	LocalTime nowTime = LocalTime.now();
	LocalTime plusSeconds = nowTime.plusSeconds(20);
	LocalTime plusHours = nowTime.plusHours(6);
	LocalTime minusMinutes = nowTime.minusMinutes(20);
	LocalTime minusNanos = nowTime.minusNanos(100_100);
	LocalDateTime nowDateTime = LocalDateTime.now();
	LocalDateTime plusYears = nowDateTime.plusYears(3);
	LocalDateTime minusMillenniaDate = nowDateTime.minus(1,ChronoUnit.MILLENNIA);

        System.out.println("Настоящее время");
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println("Плюсуем время");
        System.out.println(plus2days);
        System.out.println(plusWeek);
        System.out.println(plus3Month);
        System.out.println(plusPeriod);
        System.out.println(plusMillennia);
        System.out.println("Отнимаем время");
        System.out.println(minus2days);
        System.out.println(minusWeek);
        System.out.println(minus3Month);
        System.out.println(minusPeriod);
        System.out.println(minusMillennia);
    }
}
