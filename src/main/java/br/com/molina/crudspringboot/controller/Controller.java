package br.com.molina.crudspringboot.controller;

import br.com.molina.crudspringboot.interfaceService.IpessoaService;
import br.com.molina.crudspringboot.modelo.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

    @Autowired
    private IpessoaService service;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Pessoa> pessoas = service.listar();
        model.addAttribute("pessoas", pessoas);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated Pessoa p, Model model) {
        service.save(p);
        return "redirect:/listar";
    }
}