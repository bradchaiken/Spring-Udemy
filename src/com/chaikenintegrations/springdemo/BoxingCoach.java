package com.chaikenintegrations.springdemo;

/**
 * Created by bradchaiken on 4/5/17.
 */
public class BoxingCoach implements Coach {

    private FortuneService fortuneService;

    // constructor for dependency injection
    public BoxingCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on the Heavy Bag";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }

}
