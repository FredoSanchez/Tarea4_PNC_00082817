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
	public String enviarForm(Producto producto) {
		return "index";
	}
	
	
	
	@PostMapping("/formData")
	public ModelAndView procesar(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("index");
		}else {
			mav.setViewName("exito");
			mav.addObject("producto", producto);
		}		
		
		return mav;
	}
}