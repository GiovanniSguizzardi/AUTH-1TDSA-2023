package br.com.benezinho_holding.model;

import br.com.benezinho_holding.pessoa.Pessoa;
import br.com.benezinho_holding.pessoa.PessoaJuridica;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Sistema {
    private Long id;
    private String nome;
    private String sigla;
    private Collection<Pessoa> responsaveis = new Vector<>();
    public Sistema addResponsavel(Pessoa responsavel){
        this.getResponsaveis().add(responsavel);
        return this;
    }
    public Sistema removeResponsavel(Pessoa responsavel){
        this.getResponsaveis().remove(responsavel);
        return this;
    }
    private Collection<Pessoa> getResponsaveis() {
        return Collections.unmodifiableCollection(this.responsaveis);
    }
    public void setResponsaveis(Collection<Pessoa> responsaveis) {
        this.responsaveis = responsaveis;
    }

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
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Sistema{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }

    public Sistema(Long id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }
    public Sistema() {
    }
}
