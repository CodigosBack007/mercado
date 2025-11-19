package br.com.senai.backend.sistema_mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/listar-todos")
    public List<Funcionario> listarTodos(){
        return funService.listarTodos();
    }

    @PutMapping("/atualizar/{id}")
    public Funcionario atualizar(@PathVariable Integer id, @RequestBody Funcionario funcionario){
        return funService.atualizar(id, funcionario);
    }

    @DeleteMapping("/deletar/{id}")
    public String removerPorId(@PathVariable Integer id) {
        if(funService.removerPorId(id)) {
            return "Funcionario removida com sucesso!";
        }
        return "falha ao remover Funcionario";
    }
}