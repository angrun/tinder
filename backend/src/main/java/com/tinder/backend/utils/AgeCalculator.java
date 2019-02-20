package com.tinder.backend.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }


//    public static void main(String[] args) {
//        System.out.println(calculateAge(LocalDate.now(), LocalDate.now()));
//        System.out.println(LocalDate.);
//    }
}