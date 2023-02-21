package com.job.scheduler.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulerController {

	public String Schedule() {
		// schedulerService.job();
		return "done";
	}

	@RequestMapping(value = "/sendemail")
	public String sendEmail() {
		return "Email sent Sucessfully";
	}

}
