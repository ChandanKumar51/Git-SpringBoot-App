package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GitSprinBootAppApplication {
        private static final string REST_URL="https:www.equifax.com/getScores";

	public static void main(String[] args) {
	ConfigurableApplicationContext run =        SpringApplication.run(GitSprinBootAppApplication.class, args);
	//changes for HTS-134
    
        int a=10;
	run.close();
	}

//HTS-200 related changes
public void doProcess(){
    //logic goes here
}

}
