package com.chaikenintegrations.springdemo;

/**
 * Created by bradchaiken on 2/26/17.
 */
public class MyApp {

    public static void main (String[] args) {
        // create object
        Coach theCoach = new TrackCoach();

        // use object
        prt(theCoach.getDailyWorkout());
    }

    public static void prt(String string) {
        System.out.println(string);
    }
}
