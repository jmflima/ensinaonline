package com.esoltecnologia.ensinaonline.resouces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esoltecnologia.ensinaonline.domain.Curso;

@RestController
@RequestMapping(value = "/cursos")
public class CursoResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Curso> listar() {
		
		Curso c1 = new Curso(1, "Spring Boot", 60);
		Curso c2 = new Curso(2, "Java", 90);
		Curso c3 = new Curso(3, "Rest", 40);
		
		List<Curso> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		return lista;
	}

}
