package day21;

import java.util.ArrayList;
import java.util.EnumSet;

public class DailyWork {

    public static void main(String[] args) {

        ArrayList<Day> days = new ArrayList<>();
        days.add(Day.MONDAY);
        days.add(Day.TUESDAY);
        days.add(Day.WEDNESDAY);
        days.add(Day.THURSDAY);
        days.add(Day.FRIDAY);
        days.add(Day.SATURDAY);
        days.add(Day.SUNDAY);

        System.out.println(days);

        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println(allDays);

        EnumSet<Day> nonDays = EnumSet.noneOf(Day.class);
        System.out.println(nonDays);

        EnumSet<Day> rangeDay = EnumSet.range(Day.MONDAY, Day.FRIDAY);
        System.out.println(rangeDay);

        EnumSet<Day> specificDay = EnumSet.of(Day.MONDAY, Day.WEDNESDAY, Day.FRIDAY);
        System.out.println(specificDay);
    }
}
