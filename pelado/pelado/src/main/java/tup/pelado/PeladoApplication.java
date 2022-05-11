package tup.pelado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PeladoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeladoApplication.class, args);
	}

	@GetMapping("/")
	public String hola() {
		int a = 4;
		int b = 34;
		float c = b / a;
		// return String.format("c = b / a = %f", c);
		return Float.toString(c);
	}
}
