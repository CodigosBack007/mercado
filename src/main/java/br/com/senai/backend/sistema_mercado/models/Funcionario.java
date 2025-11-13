package br.com.senai.backend.sistema_mercado.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
     private Integer nome;

     @Column(name = "cpf")
     private String cpf;

     @Column(name = "cargo")
     private String cargo;

     @Column(name = "data_nascimento")
     private String dataNascimento;

     @ManyToMany
     @JoinTable(
        name = "funcionario-mercadoria",
        joinColumns=@JoinColumn(name="id_funcionario", referencedColumnName="id"),
        inverseJoinColumns=@JoinColumn(name="id_mercadoria", referencedColumnName="id")
     )
     private List<Mercadoria> mercadorias;

    public Funcionario() {
    }

    public Funcionario(String cargo, String cpf, String dataNascimento, Integer id, List<Mercadoria> mercadorias, Integer nome) {
        this.cargo = cargo;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.id = id;
        this.mercadorias = mercadorias;
        this.nome = nome;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public Integer getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(Integer nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the mercadorias
     */
    public List<Mercadoria> getMercadorias() {
        return mercadorias;
    }

    /**
     * @param mercadorias the mercadorias to set
     */
    public void setMercadorias(List<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
    }


}
