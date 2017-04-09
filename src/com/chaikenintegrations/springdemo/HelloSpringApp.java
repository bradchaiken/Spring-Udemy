package com.chaikenintegrations.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bradchaiken on 4/5/17.
 */
public class HelloSpringApp {
    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theBaseballCoach = context.getBean("myBaseballCoach", Coach.class);
        // call methods on the bean
        System.out.println(theBaseballCoach.getDailyWorkout());

        // retrieve bean from spring container
        Coach theBoxingCoach = context.getBean("myBoxingCoach", Coach.class);
        // call methods on the bean
        System.out.println(theBoxingCoach.getDailyWorkout());

        // retrieve bean from spring container
        Coach theTrackCoach = context.getBean("myTrackCoach", Coach.class);
        // call methods on the bean
        System.out.println(theTrackCoach.getDailyWorkout());

        // close the context
        context.close();

    }
}
