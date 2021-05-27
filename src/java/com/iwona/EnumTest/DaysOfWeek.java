package com.iwona.EnumTest;

public enum DaysOfWeek {
    MONDAY ("Monday", "Poniedziałek", "workingDay"),
    TUESDAY ("Tuesday", "Wtorek", "workingDay"),
    WEDNESDAY ("Wednesday", "Środa", "workingDay"),
    THURSDAY ("Thursday", "Czwartek", "workingDay"),
    FRIDAY ("Friday", "Piątek", "workingDay"),
    SATURDAY ("Saturday", "Sobota", "weekend"),
    SUNDAY ("Sunday", "Niedziela", "weekend");

    private final String englishName;
    private final String polishName;
    private final String days;


    DaysOfWeek (String englishName, String polishName, String days) {
        this.englishName = englishName;
        this.polishName = polishName;
        this.days = days;
    }
    public String getEnglishName (){
        return englishName;
    }
    public String getPolishName () {
        return polishName;
    }
    public String getDays () {
        return days;
    }

}
