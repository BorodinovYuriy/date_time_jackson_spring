package com.example.date_time;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DateTimeApplication {
    //Обращаемся за датой на http://localhost:8080/time
	public static void main(String[] args) {
		SpringApplication.run(DateTimeApplication.class, args);
	}

}
