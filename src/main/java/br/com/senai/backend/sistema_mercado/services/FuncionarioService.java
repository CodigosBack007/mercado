package br.com.senai.backend.sistema_mercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.backend.sistema_mercado.models.Funcionario;
import br.com.senai.backend.sistema_mercado.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioRepository funRepository;

    public Funcionario cadastrar(Funcionario funcionario){
        return funRepository.save(funcionario);
    }

    public Funcionario recuperarPorId(Integer id){
        return funRepository.findById(id).get();
    }

    public List<Funcionario> listarTodos() {
        return funRepository.findAll();
    }

   public Funcionario atualizar(Integer id, Funcionario funcionario){
    Funcionario func = funRepository.findById(id).get();
    if(func != null) {
        funcionario.setId(func.getId());
        return funRepository.save(funcionario);
    }
    return null;
}

    public  boolean removerPorId(Integer id){
        Funcionario func = funRepository.findById(id).get();
        if(func != null){
          funRepository.deleteById(id);
        return true;
    }
        return false;
}
}

