package com.chaikenintegrations.springdemo;

/**
 * Created by bradchaiken on 2/26/17.
 */
public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    // constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in the Batting Cage";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }

}
