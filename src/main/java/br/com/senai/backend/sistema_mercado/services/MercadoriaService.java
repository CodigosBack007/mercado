package br.com.senai.backend.sistema_mercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.backend.sistema_mercado.models.Mercadoria;
import br.com.senai.backend.sistema_mercado.repositories.MercadoriaRepository;

@Service
public class MercadoriaService {
    
    @Autowired
    private MercadoriaRepository merRepository;

    public Mercadoria cadastrar(Mercadoria mercadoria){
        return merRepository.save(mercadoria);
    }

    public Mercadoria recuperarPorId(Integer id){
        return merRepository.findById(id).get();
    }

    public List<Mercadoria> listarTodos() {
        return merRepository.findAll();
    }

    public Mercadoria atualizar(Integer id, Mercadoria mercadoria){
        Mercadoria merc = merRepository.findById(id).get();
        if(merc != null) {
        mercadoria.setId(merc.getId());
        return merRepository.save(mercadoria);
        }
        return null;
    }
    
}

