package br.com.senai.backend.sistema_mercado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.backend.sistema_mercado.models.Mercadoria;
import br.com.senai.backend.sistema_mercado.services.MercadoriaService;


@RestController
@RequestMapping("/Mercadoria")
public class MercadoriaController {
    @Autowired
    private MercadoriaService merService;

    @PostMapping("/cadastrar")
    public Mercadoria cadastrar(@RequestBody Mercadoria mercadoria) {
        return merService.cadastrar(mercadoria);
    }

    @GetMapping("/recuperar")
    public Mercadoria recuperarPorId(@RequestBody Integer id) {
        return merService.recuperarPorId(id);
    
    
    
}
}