package dev.ronaldomarques.herokutestapp1;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class HerokuTestApp1Application {
	
	public static void main(String[] args) {
		System.out.println("Hello Heroku! 1");
		SpringApplication.run(HerokuTestApp1Application.class, args);
		System.out.println("Hello Heroku! 2");
	}
	
}
