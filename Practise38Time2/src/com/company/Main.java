package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        //Сравнение LocalDate
	LocalDate now = LocalDate.now();
	LocalDate _2017 = LocalDate.of(2017,9,23);
	boolean isAfter = now.isAfter(_2017);
	boolean isBefore = now.isBefore(_2017);
        System.out.println(isAfter);
        System.out.println(isBefore);
        //Сравнение LocalTime
        LocalTime nowTime = LocalTime.now();
        LocalTime after2hours = nowTime.plusHours(2);
        boolean isBeforeTime = nowTime.isBefore(after2hours);
        boolean isAfterTime = nowTime.isAfter(after2hours);
        System.out.println(isBeforeTime);
        System.out.println(isAfterTime);
        //Сравнение LocalDateTime
        LocalDateTime nowLDT = LocalDateTime.now();
        LocalDateTime monthAgo = nowLDT.minusMonths(1);
        boolean isLDTBefore = nowLDT.isBefore(monthAgo);
        boolean isLDTAfter = nowLDT.isAfter(monthAgo);
        System.out.println(isLDTBefore);
        System.out.println(isLDTAfter);
    }
}
