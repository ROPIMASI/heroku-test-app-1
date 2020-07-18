package dev.ronaldomarques.herokutestapp1.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloHerokuController {
	@GetMapping("/hello")
	public String helloHeroku() {
		return "HELLO HEROKU! By ROPIMASI.";
	}
	
	
	@GetMapping("/version")
	public String version() {
		return "0.1.0-dev";
	}
}
