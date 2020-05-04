package com.uca.capas.Tarea4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.Tarea4.domain.Producto;



@Controller
public class MainController {
	
	@GetMapping("/producto")
	public String enviarForm(Producto product) {
		return "index";
	}
	
	
	
	@PostMapping("/formData")
	public ModelAndView procesar(@Valid @ModelAttribute Producto product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("exito");
		}else {
			mav.setViewName("fallo");
			mav.addObject("producto", product);
		}		
		
		return mav;
	}
}