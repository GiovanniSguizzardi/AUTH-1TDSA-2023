package br.com.benezinho_holding.model;

import java.util.Collection;

public class Profile {
    private Long id;
    private String nome;
    private Collection<Role> cargo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Role> getCargo() {
        return cargo;
    }

    public void setCargo(Collection<Role> cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo=" + cargo +
                '}';
    }

    public Profile(Long id, String nome, Collection<Role> cargo) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
    }

    public Profile() {
    }
}
