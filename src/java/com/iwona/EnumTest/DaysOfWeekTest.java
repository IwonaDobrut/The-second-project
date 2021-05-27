package com.iwona.EnumTest;

public class DaysOfWeekTest { public static void main(String[] args) {

    DaysOfWeek allDaysOfWeek [] = DaysOfWeek.values();
    System.out.println("Days of week: ");
    for (DaysOfWeek week1 : DaysOfWeek.values())
        System.out.println(week1 + " : " + week1.getDays() + " - " + week1.ordinal());
    System.out.println();

    System.out.println(DaysOfWeek.MONDAY.getEnglishName() + " - " + DaysOfWeek.MONDAY.getPolishName());
    System.out.println(DaysOfWeek.TUESDAY.getEnglishName() + " - " +  DaysOfWeek.TUESDAY.getPolishName());
    System.out.println(DaysOfWeek.WEDNESDAY.getEnglishName() + " - " + DaysOfWeek.WEDNESDAY.getPolishName());
    System.out.println(DaysOfWeek.THURSDAY.getEnglishName() + " - " + DaysOfWeek.THURSDAY.getPolishName());
    System.out.println(DaysOfWeek.FRIDAY.getEnglishName() + " - " + DaysOfWeek.FRIDAY.getPolishName());
    System.out.println(DaysOfWeek.SATURDAY.getEnglishName() + " - " + DaysOfWeek.SATURDAY.getPolishName());
    System.out.println(DaysOfWeek.SUNDAY.getEnglishName() + " - " + DaysOfWeek.SUNDAY.getPolishName());

    DaysOfWeek week, week1, week2, week3;
    week = DaysOfWeek.MONDAY;
    week1 = DaysOfWeek.FRIDAY;
    week2 = DaysOfWeek.SATURDAY;
    week3 = DaysOfWeek.SUNDAY;

    System.out.println();
    if (week.compareTo(week2) < 0)
        System.out.println(week + " is working day " );
    if (week2.compareTo(week) > 0)
        System.out.println(week2 + " is weekend " );
    if (week3.compareTo(week2) > 0)
        System.out.println(week3 + " is weekend " );

}

}
