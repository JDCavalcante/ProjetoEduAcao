package br.com.devtur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.devtur.model.Cliente;
import br.com.devtur.model.UF;
import br.com.devtur.repositorios.ClienteRepositorio;
import br.com.devtur.utils.SenhaUtils;
import br.com.devtur.model.Entidade;


@Controller
@RequestMapping("/cliente")
public class ClienteControle {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @GetMapping
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("cliente/home");

        modelAndView.addObject("cliente", clienteRepositorio.findAll());

        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView detalhes(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("cliente/detalhes");

        modelAndView.addObject("cliente", clienteRepositorio.getOne(id));

        return modelAndView;
    }

    @GetMapping("/cadastrar")
    public ModelAndView cadastrar() {
        ModelAndView modelAndView = new ModelAndView("cliente/formulario");

        modelAndView.addObject("cliente", new Cliente());
        modelAndView.addObject("ufs", UF.values());

        return modelAndView;
    }

    @GetMapping("/{id}/editar")
    public ModelAndView editar(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("cliente/formulario");

        modelAndView.addObject("cliente", clienteRepositorio.getOne(id));
        modelAndView.addObject("ufs", UF.values());

        return modelAndView;
    }
    
    @PostMapping({"/cadastrar", "/{id}/editar"})
    public String salvar(Cliente cliente) {
        clienteRepositorio.save(cliente);

        return "redirect:/cliente";
    }

    @GetMapping("/{id}/excluir")
    public String excluir(@PathVariable Long id) {
        clienteRepositorio.deleteById(id);

        return "redirect:/cliente";
    }
    
    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("cliente/index");


        return modelAndView;
    }
    
    @GetMapping("/sobre")
    public ModelAndView sobre() {
        ModelAndView modelAndView = new ModelAndView("cliente/sobre");


        return modelAndView;
    }
 
 @GetMapping("/destino")
    public ModelAndView destino() {
        ModelAndView modelAndView = new ModelAndView("cliente/destino");


        return modelAndView;
    }
 
 @GetMapping("/contato")
    public ModelAndView contato() {
        ModelAndView modelAndView = new ModelAndView("cliente/contato");


        return modelAndView;
    }
 
 @GetMapping("/promocoes")
    public ModelAndView promocoes() {
        ModelAndView modelAndView = new ModelAndView("cliente/promocoes");


        return modelAndView;
    }
 
 @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("cliente/login");


        return modelAndView;
 
 }
    
    
}
