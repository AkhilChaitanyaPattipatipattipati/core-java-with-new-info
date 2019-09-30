package com.quartz_scheduler;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

public class SchedulerExample {
    public static void main(String[] args) {

        try {
            // Grab the Scheduler instance from the Factory
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler ();

            // and start it off
            scheduler.start ();
            // Tell quartz to schedule the job using our trigger

            // define the job and tie it to our HelloJob class
            try {
                scheduler = StdSchedulerFactory.getDefaultScheduler ();
            } catch (SchedulerException e) {
                e.printStackTrace ();
            }
            JobBuilder jobBuilder = newJob ( HelloJob.class );
            jobBuilder.withIdentity ( "tiestamp", "group1" );
            JobDetail job = jobBuilder.build ();

            // Trigger the job to run now, and then repeat every 40 seconds
            SimpleTrigger trigger = newTrigger ()
                    .withIdentity ( "trigger1", "group1" )
                    .startNow ()
                    .withSchedule ( SimpleScheduleBuilder.simpleSchedule ()
                                                         .withIntervalInSeconds ( 5 )//cromsexpression
                                                         .repeatForever () )
                    .build ();

            scheduler.scheduleJob ( job, trigger );

          //  scheduler.shutdown ();

        } catch (SchedulerException se) {
            se.printStackTrace ();
        }
    }
}

