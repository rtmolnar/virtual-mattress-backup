package com.virtual.mattress.rest.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.mattress.rest.api.controller.dto.TopicoDTO;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDTO> lista(){
		
		Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programaçao"));
		Topico topico2 = new Topico("Duvida", "Duvida sobre ux", new Curso("UX", "UX"));
		Topico topico3 = new Topico("Duvida", "Duvida sobre autimatizaçao", new Curso("Selenium", "Teste"));
		
		return TopicoDTO.converter(Arrays.asList(topico, topico2, topico3));
	}
}
