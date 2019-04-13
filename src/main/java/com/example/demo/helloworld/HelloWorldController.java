package com.example.demo.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {
	
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "hello world";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		//throw new RuntimeException("An error occured");
		return new HelloWorldBean("hello world");
	}
	
	@GetMapping(path="/hello-world-bean-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		
		return new HelloWorldBean("hello world,  "+ name);
	}

}
