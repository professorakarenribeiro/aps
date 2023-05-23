import java.sql.*; // importa a biblioteca SQL
import java.util.ArrayList;

import controller.EstudanteController;
import model.*;
import view.EstudanteView;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Meu projeto JDBC!");

        // organizar seus dados de conexão em strings é uma boa ideia!
        String mySQLURL = "jdbc:mysql://localhost:3306/BDalg3"; // informar o nome do banco no final da URL é opcional
        String usuario = "root";
        String senha = "123456";

        // realiza a conexão com o banco
        try (Connection conexao = DriverManager.getConnection(mySQLURL, usuario, senha)) {

            if (conexao != null) {
                System.out.println("Conectado com sucesso à instância MySQL!");

                EstudanteDAOImpl estudanteDAO = new EstudanteDAOImpl(conexao);
                EstudanteView estudanteView = new EstudanteView();
                EstudanteController estudanteController = new EstudanteController(conexao, estudanteDAO, estudanteView);

            }

            conexao.close(); // fecha a conexão com o banco - sempre fechar após o uso!

        } catch (SQLException ex) {
            System.out.println("Houve um problema com a conexão.");
            ex.printStackTrace();
        }
    }
}