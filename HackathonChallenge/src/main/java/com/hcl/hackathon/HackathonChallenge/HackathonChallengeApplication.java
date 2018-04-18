package com.hcl.hackathon.HackathonChallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.hcl.hackathon.controller"})
@EntityScan("com.hcl.hackathon.domain")
@EnableJpaRepositories("com.hcl.hackathon.repository")
public class HackathonChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackathonChallengeApplication.class, args);
	}
}
