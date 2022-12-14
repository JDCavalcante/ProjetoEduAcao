package br.com.devtur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.devtur.model.Viagem;
import br.com.devtur.repositorios.ClienteRepositorio;
import br.com.devtur.repositorios.ViagemRepositorio;




@Controller
@RequestMapping("/cliente/viagem")
public class ViagemController {

	 @Autowired
	    private ViagemRepositorio viagemRepositorio;

	    @Autowired
	    private ClienteRepositorio clienteRepositorio;

	    @GetMapping
	    public ModelAndView home() {
	        ModelAndView modelAndView = new ModelAndView("/home");

	        modelAndView.addObject("viagem", viagemRepositorio.findAll());

	        return modelAndView;
	    }

	    @GetMapping("/{id}")
	    public ModelAndView detalhes(@PathVariable Long id) {
	        ModelAndView modelAndView = new ModelAndView("/detalhes");

	        modelAndView.addObject("viagem", viagemRepositorio.getOne(id));

	        return modelAndView;
	    }

	    @GetMapping("/cadastrarViagem")
	    public ModelAndView cadastrar() {
	        ModelAndView modelAndView = new ModelAndView("cliente/formularioViagem");

	        modelAndView.addObject("viagem", new Viagem());
	        modelAndView.addObject("clientes", clienteRepositorio.findAll());


	        return modelAndView;
	    }

	    @GetMapping("/{id}/editar")
	    public ModelAndView editar(@PathVariable Long id) {
	        ModelAndView modelAndView = new ModelAndView("/formularioViagem");

	        modelAndView.addObject("viagem", viagemRepositorio.getOne(id));
	        modelAndView.addObject("clientes", clienteRepositorio.findAll());


	        return modelAndView;
	    }

	    @PostMapping({"/cadastrarViagem", "/{id}/editar"})
	    public String salvar(Viagem viagem) {
	        viagemRepositorio.save(viagem);

	        return "redirect:/cliente";
	    }

	    @GetMapping("/{id}/excluir")
	    public String excluir(@PathVariable Long id) {
	        viagemRepositorio.deleteById(id);

	        return "redirect:/cliente";
	    }
	    
	}

