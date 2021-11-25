package gestion_clientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class GestionClientes {
	
	@GetMapping("/")
	public String acceso() {
		return "clientes";
	}

}
