package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//is the entry point of our application, tells spring the entry point of our program
//made up of several annotations 
public class WebDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebDevApplication.class, args);
	}

}
