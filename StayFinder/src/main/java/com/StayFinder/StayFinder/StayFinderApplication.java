package com.StayFinder.StayFinder;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StayFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(StayFinderApplication.class, args);
		System.out.println("hi rk");
	}


}
