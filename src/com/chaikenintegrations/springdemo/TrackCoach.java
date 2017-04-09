package com.chaikenintegrations.springdemo;

/**
 * Created by bradchaiken on 4/5/17.
 */
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
        // empty constructor
    }

    // constructor for dependency injection
    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }

}
