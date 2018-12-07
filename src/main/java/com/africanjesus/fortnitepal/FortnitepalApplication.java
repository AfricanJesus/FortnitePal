package com.africanjesus.fortnitepal;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class FortnitepalApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FortnitepalApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FortnitepalApplication.class);
	}
	private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
		return builder.sources(FortnitepalApplication.class).bannerMode(Banner.Mode.OFF);
	}
}
