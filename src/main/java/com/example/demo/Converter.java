package com.example.demo;

import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base/{texto}")
public class Converter {
	
	String base64;
	
	@GetMapping
	public String toBase64(@PathVariable("texto") String texto) {
		return base64 = Base64.getEncoder().encodeToString(texto.getBytes());
	}

}
