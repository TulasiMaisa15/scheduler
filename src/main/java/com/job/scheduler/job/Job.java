package com.job.scheduler.job;

import java.time.LocalDateTime;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.job.scheduler.service.SchedulerService;

@Component
@EnableScheduling
@EnableAsync
public class Job {
	
	@Autowired
	private SchedulerService schedulerService;
	
	
		@Scheduled(cron="*/5 * * * * * ")//every 15 seconds
		public void schedulerJob() {
			LocalDateTime lDT=LocalDateTime.now();
			
			System.out.println("Job Scheduler Program"+lDT.now());
		}
		
		@Async
		@Scheduled(cron="0 */1 * * * * ")//every one minute
		public void sendMail() throws MessagingException {
			schedulerService.sendEmail("tulasi.maisa@gmail.com", "SpringBoot mail sending",

					"Hello," + "My New Scheduler program");

		}


	}


