package br.com.molina.crudspringboot.modelo;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String telefone;

    public Pessoa(int id, String name, String telefone) {
        this.id = id;
        this.nome = name;
        this.telefone = telefone;
    }

    public Pessoa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
