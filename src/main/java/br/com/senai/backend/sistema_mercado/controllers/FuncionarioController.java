package br.com.senai.backend.sistema_mercado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.backend.sistema_mercado.models.Funcionario;
import br.com.senai.backend.sistema_mercado.services.FuncionarioService;


@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funService;

    @PostMapping("/cadastrar")
    public Funcionario cadastrar(@RequestBody Funcionario funcionario) {
        return funService.cadastrar(funcionario);
    }

    @GetMapping("/recuperar")
    public Funcionario recuperarPorId(@RequestBody Integer id) {
        return funService.recuperarPorId(id);
    
    
    
}
}