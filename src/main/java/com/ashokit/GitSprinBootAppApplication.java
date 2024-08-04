package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GitSprinBootAppApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext run = SpringApplication.run(GitSprinBootAppApplication.class, args);
	//changes for HTS-134
	run.close();
	}

}
