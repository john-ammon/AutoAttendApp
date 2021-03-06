package com.example.autoattendapp;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;

import java.util.HashMap;
import java.util.Map;

public class MeetingOfClass {

    public static final String MONDAY = "Monday";
    public static final String TUESDAY = "Tuesday";
    public static final String WEDNESDAY = "Wednesday";
    public static final String THURSDAY = "Thursday";
    public static final String FRIDAY = "Friday";
    public static final String SATURDAY = "Saturday";
    public static final String SUNDAY = "Sunday";

    public String weekday;
    public String startTime;
    public String endTime;


    public static int getIndexOfWeekDay(String weekday){
        if(weekday.equals(MONDAY))
            return 2;
        else if(weekday.equals(TUESDAY))
            return 3;
        else if(weekday.equals(WEDNESDAY))
            return 4;
        else if(weekday.equals(THURSDAY))
            return 5;
        else if(weekday.equals(FRIDAY))
            return 6;
        else if(weekday.equals(SATURDAY))
            return 7;
        else if(weekday.equals(SUNDAY))
            return 1;
        else
            return -1;
    }
}
