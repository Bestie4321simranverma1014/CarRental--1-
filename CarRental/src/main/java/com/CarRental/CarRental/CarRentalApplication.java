package com.CarRental.CarRental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.CarRental.CarRental"})

public class CarRentalApplication {
	public static void main(String[] args) {
		SpringApplication.run(CarRentalApplication.class, args);
	}

}

@Controller
class HomeController {
	@GetMapping("/")
	public String index() {
		return "index.html";
	}
}
