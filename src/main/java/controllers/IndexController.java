package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	private static final String MSG_SALUDO = "Gracias por visitar mi web";
	
	@GetMapping({"/","/index"})
	public String index(Model model) {
		model.addAttribute("mensaje", MSG_SALUDO);
		return "index";
	}
}
