package br.com.bentao.produto_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private String endereco;
    private String nome;

    public Usuario() {}

    public Usuario(String cpf, LocalDate dataNascimento, String email, String endereco, String nome) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.endereco = endereco;
        this.nome = nome;
    }

    //Getters
    public Long getId() {return id;}
    public String getCpf() {return cpf;}
    public LocalDate getDataNascimento() {return dataNascimento;}
    public String getEmail() {return email;}
    public String getEndereco() {return endereco;}
    public String getNome() {return nome;}

    //Setters
    public void setId(Long id) {this.id = id;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public void setDataNascimento(LocalDate dataNascimento) {this.dataNascimento = dataNascimento;}
    public void setEmail(String email) {this.email = email;}
    public void setEndereco(String endereco) {this.endereco = endereco;}
    public void setNome(String nome) {this.nome = nome;}
       
}
