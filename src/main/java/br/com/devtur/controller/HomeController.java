package br.com.devtur.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.com.devtur.model.Cliente;
import br.com.devtur.model.Funcionario;
import br.com.devtur.repositorios.FuncionarioRepositorio;


@Controller
@RequestMapping("/")
public class HomeController {
	
	 @GetMapping
	    public ModelAndView home() {
	        ModelAndView modelAndView = new ModelAndView("/index");

	        return modelAndView;
	    }
	 
	 @GetMapping ("/cadastrar")
	    public ModelAndView cadastrar() {
	        ModelAndView modelAndView = new ModelAndView("/cadastrar");

	        return modelAndView;
	    }
	
	 @GetMapping("/sobre")
	    public ModelAndView sobre() {
	        ModelAndView modelAndView = new ModelAndView("/sobre");


	        return modelAndView;
	    }
	 
	 @GetMapping("/causas")
	    public ModelAndView causas() {
	        ModelAndView modelAndView = new ModelAndView("/causas");


	        return modelAndView;
	    }
	 
	 @GetMapping("/causasDetalhes")
	    public ModelAndView causasDetalhes() {
	        ModelAndView modelAndView = new ModelAndView("/causasDetalhes");


	        return modelAndView;
	    }
	 
	 @GetMapping("/contato")
	    public ModelAndView contato() {
	        ModelAndView modelAndView = new ModelAndView("/contato");


	        return modelAndView;
	    }
	 
	 @GetMapping("/galeria")
	    public ModelAndView promocoes() {
	        ModelAndView modelAndView = new ModelAndView("/galeria");


	        return modelAndView;
	    }
	 
	 @GetMapping("/login")
	    public ModelAndView login() {
	        ModelAndView modelAndView = new ModelAndView("/login");


	        return modelAndView;
	 
	 }
}
