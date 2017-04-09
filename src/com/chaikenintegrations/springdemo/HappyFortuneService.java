package com.chaikenintegrations.springdemo;

/**
 * Created by bradchaiken on 4/5/17.
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
