import br.com.benezinho_holding.model.User;
import jdk.internal.org.jline.utils.InfoCmp;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import static jdk.internal.org.jline.utils.InfoCmp.Capability.*;

public class Main {
    public static void main(String[] args) {


// Criando alguns usuários para teste
        User usuario1 = new User("Email 1", "usuario1@example.com", "senha123");
        User usuario2 = new User("Email 2", "usuario2@example.com", "senha456");
        User usuario3 = new User("Email 3", "usuario3@example.com", "senha789");

        // Criando uma lista de usuários
        List<User> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        // Consultando um usuário por email e senha
        String emailConsulta = "usuario2@example.com";
        String senhaConsulta = "senha456";
        User userConsultado = User.consultarUsuario(emailConsulta, senhaConsulta, usuarios);

        // Verificando se o usuário foi encontrado
        if (userConsultado != null) {
            System.out.println("Usuário encontrado: " + userConsultado.getEmail());
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}