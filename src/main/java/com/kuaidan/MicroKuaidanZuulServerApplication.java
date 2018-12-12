package com.kuaidan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicroKuaidanZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroKuaidanZuulServerApplication.class, args);
	}
}
