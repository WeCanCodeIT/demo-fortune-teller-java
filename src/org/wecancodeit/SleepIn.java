package org.wecancodeit;

public class SleepIn {
    public static void main(String[] args) {
        System.out.println(sleepIn(true,false));
    }
    public static boolean sleepIn(boolean weekday, boolean vacation){

        return !weekday || vacation;
    }
}
