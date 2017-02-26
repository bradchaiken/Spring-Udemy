package com.chaikenintegrations.springdemo;

/**
 * Created by bradchaiken on 2/26/17.
 */
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in the Batting Cage";
    }

}
