package com.company;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
	LocalDate now = LocalDate.now();
	LocalDate dateOfMyBirthday = LocalDate.of(2022,1,4);
	Duration duration = Duration.between(now.atStartOfDay(), dateOfMyBirthday.atStartOfDay());
        System.out.println(duration.toDays());

    }
}
