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

    @GetMapping("/recuperar/{id}")
    public Mercadoria recuperarPorId(@RequestBody Integer id) {
        return merService.recuperarPorId(id);
}

    @GetMapping("/listar-todos")
    public List<Mercadoria> listarTodos(){
        return merService.listarTodos();
    }

    @PutMapping("/atualizar/{id}")
    public Mercadoria atualizar(@PathVariable Integer id, @RequestBody Mercadoria mercadoria){
        return merService.atualizar(id, mercadoria);
    }

    @DeleteMapping("/deletar/{id}")
    public String removerPorId(@PathVariable Integer id) {
        if(merService.removerPorId(id)) {
            return "mercadoria removida com sucesso!";
        }
        return "falha ao remover mercadoria";
    }
}