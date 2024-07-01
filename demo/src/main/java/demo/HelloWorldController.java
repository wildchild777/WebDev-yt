package demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/Hello")
	public String HelloWorld() {
		return "Hello World!";
	}
}
