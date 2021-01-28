package com.hernan.ohrc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class OhrcApplication {

	public static void main(String[] args) {
		SpringApplication.run(OhrcApplication.class, args);
	}
	
	private static final String MSG_SALUDO = "Gracias por visitar mi web";
	
	@GetMapping({"/","/index"})
	public String index(Model model) {
		model.addAttribute("mensaje", MSG_SALUDO);
		return "index";
	}
}
