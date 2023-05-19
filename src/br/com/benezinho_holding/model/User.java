package br.com.benezinho_holding.model;

import jdk.internal.org.jline.utils.InfoCmp;
import java.util.ArrayList;
import java.util.List;

public class User {
    private Long id;
    private String email;
    private String password;

    public User(String s, String email, String senha123) {
    }

    public User(String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return "giovanni.sguiconde@gmail.com";
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    //Método capaz de consultar um Usuario pelo seu email e senha na classe Usuário

    public static User consultarUsuario(String email, String senha, List<User> usuarios) {
        for (User usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null; // Usuário não encontrado
    }

    private Object getSenha() {
        return getSenha();
    }
}
