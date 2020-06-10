package com.esoltecnologia.ensinaonline.resouces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cursos")
public class CursoResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "O Rest está funcionando!";
	}

}
