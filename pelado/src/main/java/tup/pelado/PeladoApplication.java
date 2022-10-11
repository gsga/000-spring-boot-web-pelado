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
    public String porDefecto() {
        System.out.println("DEFECTO");
        return "porDefecto()";
    }

    @GetMapping("1")
    public String func1() {
        System.out.println("FUNC 1111");
        return "func1()";
    }

    @GetMapping("2")
    public String func2() {
        System.out.println("FUNC 222");
        return "func2()";
    }

}
